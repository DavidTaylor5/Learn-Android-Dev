package com.andaagi.learnandroiddev.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotecardViewModel @Inject constructor(

): ViewModel() {

    //TODO grab all sets of notecards from the database

    //TODO state of the set selector -> should it be showing or not?

}