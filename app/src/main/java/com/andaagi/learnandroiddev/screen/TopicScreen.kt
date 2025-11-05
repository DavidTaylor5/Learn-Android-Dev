package com.andaagi.learnandroiddev.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme

@Composable
fun TopicScreen(modifier: Modifier = Modifier) {
    Text(
        text = "TopicScreen!",
        modifier = modifier
    )

    Button(
        onClick = {}
    ) {
        Text(text = "Navigate!")
    }
}

@Preview(showBackground = true)
@Composable
fun TopicScreenPreview() {
    LearnAndroidDevTheme {
        TopicScreen()
    }
}