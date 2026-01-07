package com.andaagi.learnandroiddev.constant

enum class Screen {
    MAIN_MENU_SCREEN {
        override fun getRouteId(): String = "MAIN_MENU_SCREEN"
    },
    QUIZ_MENU_SCREEN {
        override fun getRouteId(): String = "QUIZ_MENU_SCREEN"
    },
    QUIZ_SCREEN {
        override fun getRouteId(): String = "QUIZ_SCREEN"
    },
    LEADERBOARD_SCREEN {
        override fun getRouteId(): String = "LEADERBOARD_SCREEN"
    },
    TOPIC_SCREEN {
        override fun getRouteId(): String = "TOPIC_SCREEN"
    },
    TOPIC_MENU_SCREEN {
        override fun getRouteId(): String = "TOPIC_MENU_SCREEN"
    },
    USER_STATS_SCREEN {
        override fun getRouteId(): String = "USER_STATS_SCREEN"
    };

    abstract fun getRouteId(): String
}