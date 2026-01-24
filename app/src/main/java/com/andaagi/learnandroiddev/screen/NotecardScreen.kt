package com.andaagi.learnandroiddev.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andaagi.learnandroiddev.R
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme

//TODO support switching card sets
//TODO support listing all cards in a set
//TODO card options will animate in from the right, sets from the left


@Composable
fun NotecardScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ActionBar()

        val scrollState = rememberScrollState()

        OutlinedTextField(
            value = "BruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruhBruh",
            onValueChange = {  },
            modifier = Modifier
                .width(250.dp)
                .height(250.dp)
                .verticalScroll(scrollState)
                .background(Color.White),
            maxLines = Int.MAX_VALUE,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Red,
                unfocusedTextColor = Color.Gray,
                disabledTextColor = Color.Black,
                cursorColor = Color.Red
            ),
            enabled = false
        )

        IconButton(onClick = { /* TODO Trigger animation to flip the notecard */ }) {
            Icon(painter = painterResource(R.drawable.flip), contentDescription = "Flip the notecard")
        }

        //HorizontalOptions()

    }
}

@Composable
fun ActionBar(

) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        //TODO I want an animation when I open and close the sets, should move from right to left

        IconButton(onClick = { /* TODO open or close the menu */ }) {
            Icon(painter = painterResource(R.drawable.menu_open), contentDescription = "")
        }

        IconButton(onClick = { /* TODO Add a new set */ }) {
            Icon(painter = painterResource(R.drawable.add), contentDescription = "")
        }

        IconButton(onClick = { /* TODO Display Card List */ }) {
            Icon(painter = painterResource(R.drawable.card_list), contentDescription = "")
        }
    }
}

@Composable
fun HorizontalOptions(
    //TODO Pass in all available sets from state
    //TODO or pass in all available cards in a set
) {
    val list = List(10) { index -> index }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(Color.Red),
        contentPadding = PaddingValues(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(list.size) { item ->

            //TODO when I click a set name, I should immediately open the cards...

            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = "NotecardScreen!",
                fontSize = 22.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NotecardScreenPreview() {
    LearnAndroidDevTheme {
        NotecardScreen()
    }
}

/*
* ChatGPT recommendation for flip card animation
*@Composable
fun FlipCard(
    question: String,
    answer: String,
    modifier: Modifier = Modifier
) {
    var flipped by remember { mutableStateOf(false) }

    // Animate rotation from 0 to 180 when flipped
    val rotationY by animateFloatAsState(
        targetValue = if (flipped) 180f else 0f,
        animationSpec = tween(durationMillis = 600)
    )

    // Detect if we should show front or back (avoid mirrored text)
    val showFront = rotationY <= 90f

    Box(
        modifier = modifier
            .width(300.dp)
            .height(150.dp)
            .graphicsLayer {
                rotationY = rotationY
                cameraDistance = 12f * density // avoid perspective distortion
            }
            .clickable { flipped = !flipped },
        contentAlignment = Alignment.Center
    ) {
        if (showFront) {
            OutlinedTextField(
                value = question,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier.fillMaxSize(),
                label = { Text("Question") }
            )
        } else {
            // Back side is mirrored, so rotate 180 to correct
            Box(modifier = Modifier.graphicsLayer { rotationY = 180f }) {
                OutlinedTextField(
                    value = answer,
                    onValueChange = {},
                    readOnly = true,
                    modifier = Modifier.fillMaxSize(),
                    label = { Text("Answer") }
                )
            }
        }
    }
}
*
*
*
* */