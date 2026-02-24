package com.andaagi.learnandroiddev.presentation.model

enum class CARD_SIDE {
    ANSWER_SIDE,
    QUESTION_SIDE
}

data class CardModel(
    val question: String = "",
    val answer: String = "",
    val currSide: CARD_SIDE = CARD_SIDE.QUESTION_SIDE
)
