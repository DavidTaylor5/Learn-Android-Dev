package com.andaagi.learnandroiddev.presentation.composables

data class ButtonAction(
    val description: String,
    val action: () -> Unit
)