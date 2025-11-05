package com.andaagi.learnandroiddev.constant

enum class Screen {
    MENU_SCREEN {
        override fun getRouteId(): String = "MENU_SCREEN"
    },
    QUIZ_SCREEN {
        override fun getRouteId(): String = "QUIZ_SCREEN"
    },
    TOPIC_SCREEN {
        override fun getRouteId(): String = "TOPIC_SCREEN"
    },
    CONCEPT_SCREEN {
        override fun getRouteId(): String = "CONCEPT_SCREEN"
    },
    USER_STATS_SCREEN {
        override fun getRouteId(): String = "USER_STATS_SCREEN"
    };

    abstract fun getRouteId(): String
}