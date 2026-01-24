package com.andaagi.learnandroiddev.data

enum class CARD_SIDE {
    ANSWER_SIDE,
    QUESTION_SIDE
}

data class CardData(
    val question: String = "",
    val answer: String = "",
    val currSide: CARD_SIDE = CARD_SIDE.QUESTION_SIDE
)
