package com.andaagi.learnandroiddev.data

data class ButtonAction(
    val description: String,
    val action: () -> Unit
)
