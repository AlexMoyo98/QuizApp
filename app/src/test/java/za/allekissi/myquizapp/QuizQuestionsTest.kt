package za.allekissi.myquizapp

import junit.framework.TestCase.assertEquals
import org.junit.Test

class QuizQuestionsTest {
    @Test
    fun testQuestion1() {
        val question = Question(
            1, "What country does this flag belong to?",
            "ar",
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        assertEquals(1, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("ar", question.image)
        assertEquals("Argentina", question.optionOne)
        assertEquals("Australia", question.optionTwo)
        assertEquals("Armenia", question.optionThree)
        assertEquals("Austria", question.optionFour)
        assertEquals(1, question.correctAnswer)
    }

    @Test
    fun testQuestion2() {
        val question = Question(
            2, "What country does this flag belong to?",
            "ad",
            "Spain",
            "Switzerland",
            "Andorra",
            "Monaco",
            3
        )
        assertEquals(2, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("ad", question.image)
        assertEquals("Spain", question.optionOne)
        assertEquals("Switzerland", question.optionTwo)
        assertEquals("Andorra", question.optionThree)
        assertEquals("Monaco", question.optionFour)
        assertEquals(3, question.correctAnswer)
    }

    @Test
    fun testQuestion3() {
        val question = Question(
            3, "What country does this flag belong to?",
            "ae",
            "Oman",
            "United Arab Emirates",
            "Qatar",
            "Kuwait",
            2
        )
        assertEquals(3, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("ae", question.image)
        assertEquals("Oman", question.optionOne)
        assertEquals("United Arab Emirates", question.optionTwo)
        assertEquals("Qatar", question.optionThree)
        assertEquals("Kuwait", question.optionFour)
        assertEquals(2, question.correctAnswer)
    }

    @Test
    fun testQuestion4() {
        val question = Question(
            4, "What country does this flag belong to?",
            "af",
            "Pakistan",
            "Tajikistan",
            "Turkmenistan",
            "Afghanistan",
            4
        )
        assertEquals(4, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("af", question.image)
        assertEquals("Pakistan", question.optionOne)
        assertEquals("Tajikistan", question.optionTwo)
        assertEquals("Turkmenistan", question.optionThree)
        assertEquals("Afghanistan", question.optionFour)
        assertEquals(4, question.correctAnswer)
    }

    @Test
    fun testQuestion5() {
        val question = Question(
            5, "What country does this flag belong to?",
            "ag",
            "Barbados",
            "Antigua and Barbuda",
            "Cuba",
            "Trinidad and Tobago",
            2
        )
        assertEquals(5, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("ag", question.image)
        assertEquals("Barbados", question.optionOne)
        assertEquals("Antigua and Barbuda", question.optionTwo)
        assertEquals("Cuba", question.optionThree)
        assertEquals("Trinidad and Tobago", question.optionFour)
        assertEquals(2, question.correctAnswer)
    }

    @Test
    fun testQuestion6() {
        val question = Question(
            6, "What country does this flag belong to?",
            "ai",
            "Anguilla",
            "St. Kitts and Nevis",
            "The Bahamas",
            "Barbados",
            1
        )
        assertEquals(6, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("ai", question.image)
        assertEquals("Anguilla", question.optionOne)
        assertEquals("St. Kitts and Nevis", question.optionTwo)
        assertEquals("The Bahamas", question.optionThree)
        assertEquals("Barbados", question.optionFour)
        assertEquals(1, question.correctAnswer)
    }

    @Test
    fun testQuestion7() {
        val question = Question(
            7, "What country does this flag belong to?",
            "al",
            "Montenegro",
            "Serbia",
            "Albania",
            "Macedonia",
            3
        )
        assertEquals(7, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("al", question.image)
        assertEquals("Montenegro", question.optionOne)
        assertEquals("Serbia", question.optionTwo)
        assertEquals("Albania", question.optionThree)
        assertEquals("Macedonia", question.optionFour)
        assertEquals(3, question.correctAnswer)
    }

    @Test
    fun testQuestion8() {
        val question = Question(
            8, "What country does this flag belong to?",
            "am",
            "Azerbaijan",
            "Armenia",
            "Russia",
            "Georgia",
            2
        )
        assertEquals(8, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("am", question.image)
        assertEquals("Azerbaijan", question.optionOne)
        assertEquals("Armenia", question.optionTwo)
        assertEquals("Russia", question.optionThree)
        assertEquals("Georgia", question.optionFour)
        assertEquals(2, question.correctAnswer)
    }

    @Test
    fun testQuestion9() {
        val question = Question(
            9, "What country does this flag belong to?",
            "ao",
            "Angola",
            "Democratic Republic of the Congo",
            "Mozambique",
            "Zambia",
            1
        )
        assertEquals(9, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("ao", question.image)
        assertEquals("Angola", question.optionOne)
        assertEquals("Democratic Republic of the Congo", question.optionTwo)
        assertEquals("Mozambique", question.optionThree)
        assertEquals("Zambia", question.optionFour)
        assertEquals(1, question.correctAnswer)
    }

    @Test
    fun testQuestion10() {
        val question = Question(
            10,
            "What country does this flag belong to?",
            "aq",
            "Greenland",
            "Iceland",
            "Arctic",
            "Antarctica",
            4
        )
        assertEquals(10, question.id)
        assertEquals("What country does this flag belong to?", question.question)
        assertEquals("aq", question.image)
        assertEquals("Greenland", question.optionOne)
        assertEquals("Iceland", question.optionTwo)
        assertEquals("Arctic", question.optionThree)
        assertEquals("Antarctica", question.optionFour)
        assertEquals(4, question.correctAnswer)
    }
}