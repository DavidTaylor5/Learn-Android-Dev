package com.andaagi.learnandroiddev

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andaagi.learnandroiddev.constant.Screen
import com.andaagi.learnandroiddev.screen.AuthScreen
import com.andaagi.learnandroiddev.screen.LeaderboardScreen
import com.andaagi.learnandroiddev.screen.LoginScreen
import com.andaagi.learnandroiddev.screen.NotecardScreen
import com.andaagi.learnandroiddev.screen.QuizMenuScreen
import com.andaagi.learnandroiddev.screen.QuizScreen
import com.andaagi.learnandroiddev.screen.SignUpScreen
import com.andaagi.learnandroiddev.screen.SystemDesignScreen
import com.andaagi.learnandroiddev.screen.TopicMenuScreen
import com.andaagi.learnandroiddev.screen.TopicScreen
import com.andaagi.learnandroiddev.screen.UserStatsScreen
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme

@Composable
fun LearnAndroidDevApp() {
    LearnAndroidDevTheme {
        val loginController = rememberNavController()
        NavHost(
            navController = loginController,
            startDestination = Screen.MAIN_SCAFFOLD.getRouteId(),
        ) {
            composable(Screen.AUTH_SCREEN.getRouteId()) {
                AuthScreen()
            }
            composable(Screen.LOGIN_SCREEN.getRouteId()) {
                LoginScreen()
            }
            composable(Screen.SIGN_UP_SCREEN.getRouteId()) {
                SignUpScreen()
            }
            composable(Screen.MAIN_SCAFFOLD.getRouteId()) {
                MainScaffold()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScaffold() {
    val appController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("Learn Android Dev!") },
                modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars)
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { appController.navigate(Screen.TOPIC_MENU_SCREEN.getRouteId()) }) {
                        Icon(painter = painterResource(R.drawable.book), contentDescription = "")
                    }
                    IconButton(onClick = { appController.navigate(Screen.QUIZ_MENU_SCREEN.getRouteId()) }) {
                        Icon(painter = painterResource(R.drawable.quiz), contentDescription = "")
                    }
                    IconButton(onClick = { appController.navigate(Screen.LEADERBOARD_SCREEN.getRouteId()) }) {
                        Icon(painter = painterResource(R.drawable.score), contentDescription = "")
                    }
                    IconButton(onClick = { appController.navigate(Screen.USER_STATS_SCREEN.getRouteId()) }) {
                        Icon(painter = painterResource(R.drawable.profile), contentDescription = "")
                    }
                    IconButton(onClick = { appController.navigate(Screen.NOTECARD_SCREEN.getRouteId()) }) {
                        Icon(painter = painterResource(R.drawable.card_stack), contentDescription = "")
                    }
                    IconButton(onClick = { appController.navigate(Screen.SYSTEM_DESIGN_SCREEN.getRouteId()) }) {
                        Icon(painter = painterResource(R.drawable.system_design), contentDescription = "")
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = appController,
            startDestination = Screen.TOPIC_MENU_SCREEN.getRouteId(),
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.QUIZ_MENU_SCREEN.getRouteId()) {
                QuizMenuScreen()
            }
            composable(Screen.QUIZ_SCREEN.getRouteId()) {
                QuizScreen()
            }
            composable(Screen.LEADERBOARD_SCREEN.getRouteId()) {
                LeaderboardScreen()
            }
            composable(Screen.TOPIC_MENU_SCREEN.getRouteId()) {
                TopicMenuScreen()
            }
            composable(Screen.TOPIC_SCREEN.getRouteId()) {
                TopicScreen()
            }
            composable(Screen.USER_STATS_SCREEN.getRouteId()) {
                UserStatsScreen()
            }

            composable(Screen.NOTECARD_SCREEN.getRouteId()) {
                NotecardScreen()
            }

            composable(Screen.SYSTEM_DESIGN_SCREEN.getRouteId()) {
                SystemDesignScreen()
            }
        }
    }
}
