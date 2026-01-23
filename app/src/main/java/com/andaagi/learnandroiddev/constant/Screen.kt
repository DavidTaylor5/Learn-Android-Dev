package com.andaagi.learnandroiddev.constant

enum class Screen {
    // Navigation without Scaffold
    AUTH_SCREEN {
        override fun getRouteId(): String = "AUTH_SCREEN"
    },
    LOGIN_SCREEN {
        override fun getRouteId(): String = "LOGIN_SCREEN"
    },
    SIGN_UP_SCREEN {
        override fun getRouteId(): String = "SIGN_UP_SCREEN"
    },
    MAIN_SCAFFOLD {
        override fun getRouteId(): String = "MAIN_SCAFFOLD"
    },


    // Screens with Scaffold
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
    },

    NOTECARD_SCREEN {
        override fun getRouteId(): String = "NOTECARD_SCREEN"
    },

    SYSTEM_DESIGN_SCREEN {
        override fun getRouteId(): String = "SYSTEM_DESIGN_SCREEN"
    };

    abstract fun getRouteId(): String
}