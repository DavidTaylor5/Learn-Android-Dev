package com.andaagi.learnandroiddev.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andaagi.learnandroiddev.R
import com.andaagi.learnandroiddev.components.ButtonGrid
import com.andaagi.learnandroiddev.data.ButtonAction
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier
                .matchParentSize(),
           painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier
                .padding(start = 30.dp, top = 50.dp),
            text = "Learn\nAndroid\nDevelopment",
            color = Color.White,
            fontSize = 50.sp,
            lineHeight = 60.sp
        )

        Column(
            modifier = Modifier.wrapContentSize()
                .background(Color.White)
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Title
            Text(
                text = "Enter Email to login",
                modifier = modifier
            )

            OutlinedTextField(
                state = rememberTextFieldState(),
                label = { Text("Email")}
            )

            //Subtitle
            Text(
                text = "Create Account",
                modifier = modifier
            )


            Text(
                text = "Continue as guest",
                modifier = modifier
            )
        }
    }



}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview() {
    LearnAndroidDevTheme {
        LoginScreen()
    }
}