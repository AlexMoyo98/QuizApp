package za.allekissi.myquizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var isAnswerSelected: Boolean = false
    private var mUserName : String? = null
    private var mCorrectAnswers: Int = 0

    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null

    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_optionOne)
        tvOptionTwo = findViewById(R.id.tv_optionTwo)
        tvOptionThree = findViewById(R.id.tv_optionThree)
        tvOptionFour = findViewById(R.id.tv_optionFour)
        btnSubmit = findViewById(R.id.btnSubmit)

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        mQuestionsList = Constants.getQuestions()
        setQuestion()
    }

    private fun setQuestion() {
        defaultOptionsView()
        if (mCurrentPosition > mQuestionsList!!.size) return

        val question: Question = mQuestionsList!![mCurrentPosition - 1]
        val imageResourceName = question.image

        Glide.with(this)
            .load(
                resources.getIdentifier(
                    imageResourceName,
                    "drawable",
                    packageName
                )
            )
            .override(248, 159)
            .fitCenter()
            .into(ivImage!!)

        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if (mCurrentPosition == mQuestionsList!!.size) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3, it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        if (!isAnswerSelected) { // Check if an answer is already selected
            defaultOptionsView()

            mSelectedOptionPosition = selectedOptionNum

            val question = mQuestionsList?.get(mCurrentPosition - 1)
            val isCorrect = question?.correctAnswer == selectedOptionNum

            tv.setTextColor(Color.parseColor("#000000"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background = ContextCompat.getDrawable(
                this,
                if (isCorrect) R.drawable.correct_option_border_bg else R.drawable.wrong_option_border_bg
            )

            if (!isCorrect) {
                if (question != null) {
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                }
            }
            isAnswerSelected = true
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_optionOne -> {
                selectedOptionView(tvOptionOne!!, 1)
            }

            R.id.tv_optionTwo -> {
                selectedOptionView(tvOptionTwo!!, 2)
            }

            R.id.tv_optionThree -> {
                selectedOptionView(tvOptionThree!!, 3)
            }

            R.id.tv_optionFour -> {
                selectedOptionView(tvOptionFour!!, 4)
            }

            R.id.btnSubmit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }
                        else ->{
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME,mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionsList?.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btnSubmit?.text = "FINISH"
                    } else {
                        btnSubmit?.text = "GO TO NEXT QUESTION"
                    }
                }
                mSelectedOptionPosition = 0
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }

            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }

            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }

            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
        }
    }
}