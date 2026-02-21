package com.andaagi.learnandroiddev.data

import kotlinx.serialization.Serializable

@Serializable
data class NoteCardData(
    val question: String,
    val answer: String
)