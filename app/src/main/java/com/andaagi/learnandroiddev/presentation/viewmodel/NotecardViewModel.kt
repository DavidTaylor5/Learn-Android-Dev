package com.andaagi.learnandroiddev.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.andaagi.learnandroiddev.data.NoteCardData
import com.andaagi.learnandroiddev.data.repository.NoteCardRepository
import com.andaagi.learnandroiddev.presentation.model.CARD_SIDE
import com.andaagi.learnandroiddev.presentation.model.CardModel
import com.andaagi.learnandroiddev.presentation.state.NotecardScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class NotecardViewModel @Inject constructor(
    private val noteCardRepository: NoteCardRepository
): ViewModel() {

    private var cards: List<CardModel> = listOf()

    private val _state = MutableStateFlow(NotecardScreenState())
    val state: StateFlow<NotecardScreenState> = _state

    /**
     * Refresh the cards, that can be shown.
     */
    fun refreshNoteCards() {
        cards = noteCardRepository.getNoteCards()
            .map { data ->
                CardModel(
                    question = data.question,
                    answer = data.answer,
                    currSide = CARD_SIDE.QUESTION_SIDE
                )
            }
        val a = "huh"
    }

    //TODO grab all sets of notecards from the database

    //TODO grab all notecards in a set from the database

    //TODO state of the set selector -> should it be showing or not?

}