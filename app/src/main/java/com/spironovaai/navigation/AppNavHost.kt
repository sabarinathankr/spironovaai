package com.spironovaai.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.spironovaai.R
import com.spironovaai.ui.screens.HomeScreen
import com.spironovaai.ui.screens.SecondScreen


@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = NavRoutes.HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier.fillMaxSize().background(colorResource(R.color.teal_200))
    ) {
        homeRoute(navController)     // ✅
        secondRoute(navController)   // ✅
    }
}

