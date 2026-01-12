package com.andaagi.learnandroiddev.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.andaagi.learnandroiddev.data.ButtonAction

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