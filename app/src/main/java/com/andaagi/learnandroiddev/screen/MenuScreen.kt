package com.andaagi.learnandroiddev.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andaagi.learnandroiddev.data.ButtonAction
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme

@Composable
fun MenuScreen(
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
            items = listOf( ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}), ButtonAction(description = "option", action={}) ),
            rowCount = 2,
            colCount = 3
        )
    }
}

@Composable
fun ButtonGrid(
    modifier: Modifier = Modifier,
    items: List<ButtonAction>,
    rowCount: Int,
    colCount: Int
) {
    Column() {
        for(row in 0..rowCount) {
            Row() {
                for(col in 0..colCount) {
                    val itemIndex = row * col + col
                    if( itemIndex < items.size ) {
                        Button(
                            onClick = items[itemIndex].action
                        ) {
                            Text(
                                text = items[itemIndex].description
                            )
                        }
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview() {
    LearnAndroidDevTheme {
        MenuScreen()
    }
}