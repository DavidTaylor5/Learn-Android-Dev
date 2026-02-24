package com.andaagi.learnandroiddev.data

import kotlinx.serialization.Serializable

@Serializable
data class NoteCardListData(
    val listName: String,
    val cards: List<NoteCardData> = listOf()
)
