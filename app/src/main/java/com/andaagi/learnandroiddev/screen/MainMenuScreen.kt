package com.andaagi.learnandroiddev.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andaagi.learnandroiddev.data.ButtonAction
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme

@Composable
fun MainMenuScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Title
        Text(
            text = "Title!",
            modifier = modifier
        )

        //Subtitle
        Text(
            text = "Subtitle!",
            modifier = modifier
        )

        //Developer navigation button
        Button(
            onClick = {}
        ) {
            Text(text = "Navigate!")
        }

        // 4 x 4 buttons
        ButtonGrid(
            //modifier = Modifier.fillMaxSize(),
            items = listOf( ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}) ),
            colCount = 3
        )
    }
}

@Composable
fun ButtonGrid(
    modifier: Modifier = Modifier,
    items: List<ButtonAction>,
    colCount: Int
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(colCount)
    ) {
        items(items.size) { index ->
            Button(
                onClick = items[index].action
            ) {
                Text(
                    text = items[index].description
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview() {
    LearnAndroidDevTheme {
        MainMenuScreen()
    }
}