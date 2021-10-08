package com.assignment1.mk.navigation

import androidx.annotation.StringRes
import com.assignment1.mk.R

sealed class Screen(val route: String, @StringRes val resourceID: Int) {
    object WelcomeScreen : Screen("welcomeScreen", R.string.welcome_screen)
    object PlannerScreen : Screen("calendarScreen", R.string.planner_screen)
}
