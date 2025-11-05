package com.andaagi.learnandroiddev

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.andaagi.learnandroiddev.screen.MenuScreen
import com.andaagi.learnandroiddev.ui.theme.LearnAndroidDevTheme
import androidx.navigation.compose.rememberNavController
import com.andaagi.learnandroiddev.screen.ConceptScreen
import com.andaagi.learnandroiddev.screen.QuizScreen
import com.andaagi.learnandroiddev.screen.TopicScreen
import com.andaagi.learnandroiddev.screen.UserStatsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnAndroidDevApp() {
    LearnAndroidDevTheme {
        val navController = rememberNavController()

        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = { Text("Learn Android Dev!") },
                    modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars)
                )
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = "menu_screen",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("menu_screen") {
                    MenuScreen()
                }

                composable("quiz_screen") {
                    QuizScreen()
                }

                composable("topic_screen") {
                    TopicScreen()
                }

                composable("concept_screen") {
                    ConceptScreen()
                }

                composable("user_stats_screen") {
                    UserStatsScreen()
                }
            }
        }
    }
}