package za.allekissi.myquizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ar,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ad,
            "Spain",
            "Switzerland",
            "Andorra",
            "Monaco",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ae,
            "Oman",
            "United Arab Emirates",
            "Qatar",
            "Kuwait",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.af,
            "Pakistan",
            "Tajikistan",
            "Turkmenistan",
            "Afghanistan",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ag,
            "Barbados",
            "Antigua and Barbuda",
            "Cuba",
            "Trinidad and Tobago",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ai,
            "Anguilla",
            "St. Kitts and Nevis",
            "The Bahamas",
            "Barbados",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.al,
            "Montenegro",
            "Serbia",
            "Albania",
            "Macedonia",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.al,
            "Azerbaijan",
            "Armenia",
            "Russia",
            "Georgia",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ao,
            "Angola",
            "Democratic Republic of the Congo",
            "Mozambique",
            "Zambia",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.aq,
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