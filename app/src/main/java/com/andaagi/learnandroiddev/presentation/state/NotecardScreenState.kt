package com.andaagi.learnandroiddev.presentation.state

import com.andaagi.learnandroiddev.presentation.model.CardData


enum class ScreenState {
    SET_OPTIONS,
    CARD_OPTIONS,
    MAIN_CARD_FUNC
}

data class NotecardScreenState(
    val screen: ScreenState = ScreenState.MAIN_CARD_FUNC,
    val currentCard: CardData = CardData()
)
