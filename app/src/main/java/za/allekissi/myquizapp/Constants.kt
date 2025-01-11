package za.allekissi.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            "ar",
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            "ad",
            "Spain",
            "Switzerland",
            "Andorra",
            "Monaco",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            "ae",
            "Oman",
            "United Arab Emirates",
            "Qatar",
            "Kuwait",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            "af",
            "Pakistan",
            "Tajikistan",
            "Turkmenistan",
            "Afghanistan",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            "ag",
            "Barbados",
            "Antigua and Barbuda",
            "Cuba",
            "Trinidad and Tobago",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            "ai",
            "Anguilla",
            "St. Kitts and Nevis",
            "The Bahamas",
            "Barbados",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            "al",
            "Montenegro",
            "Serbia",
            "Albania",
            "Macedonia",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            "am",
            "Azerbaijan",
            "Armenia",
            "Russia",
            "Georgia",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            "ao",
            "Angola",
            "Democratic Republic of the Congo",
            "Mozambique",
            "Zambia",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            "aq",
            "Greenland",
            "Iceland",
            "Arctic",
            "Antarctica",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}