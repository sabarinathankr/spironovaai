package com.spironovaai.navigation

object NavRoutes {

    const val SPLASH = "splash"
    const val REGISTER = "register"
    const val LOGIN = "login"
    const val AUTH = "auth"
    const val HOME = "home"
    const val SECOND = "second"

    const val USER_ID = "userId"

    // with args
    const val SECOND_WITH_ARGS = "second/{userId}"

    fun secondWithArgs(userId: String) = "second/$userId"
}