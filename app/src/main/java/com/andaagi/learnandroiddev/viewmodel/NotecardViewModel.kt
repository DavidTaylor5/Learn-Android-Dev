package com.andaagi.learnandroiddev.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.andaagi.learnandroiddev.state.NotecardScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class NotecardViewModel @Inject constructor(

): ViewModel() {

    private val _state = MutableStateFlow(NotecardScreenState())
    val state: StateFlow<NotecardScreenState> = _state

    //TODO grab all sets of notecards from the database

    //TODO grab all notecards in a set from the database

    //TODO state of the set selector -> should it be showing or not?

}