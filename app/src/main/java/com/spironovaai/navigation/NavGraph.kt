package com.spironovaai.navigation

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.spironovaai.HomeViewModel
import com.spironovaai.ui.screens.AuthScreen
import com.spironovaai.ui.screens.HomeScreen
import com.spironovaai.ui.screens.SecondScreen
import com.spironovaai.ui.screens.SplashScreen

fun NavGraphBuilder.homeRoute(navController: NavHostController) {

    composable(NavRoutes.HOME) {

        val viewModel: HomeViewModel = viewModel()

        HomeScreen(
            viewModel = viewModel,
            onNavigateToSecond = { userId ->
                navController.navigate(
                    NavRoutes.secondWithArgs(userId)
                )
            }
        )
    }
}

fun NavGraphBuilder.authScreen(navController: NavHostController) {
    composable(NavRoutes.AUTH) {
        AuthScreen()
    }
}

fun NavGraphBuilder.splashScreen(navController: NavHostController) {

    composable(NavRoutes.SPLASH) {

        SplashScreen(
            onNavigateToHome = {
                navController.navigate(NavRoutes.AUTH) {
                    popUpTo(NavRoutes.SPLASH) { inclusive = true }
                }
            }
        )
    }
}


fun NavGraphBuilder.secondRoute(navController: NavHostController) {

    composable(
        route = NavRoutes.SECOND_WITH_ARGS,
        arguments = listOf(
            navArgument(NavRoutes.USER_ID) {
                type = NavType.StringType
            }
        )
    ) { backStackEntry ->

        val userId = backStackEntry.arguments
            ?.getString(NavRoutes.USER_ID)

        val viewModel: HomeViewModel = viewModel()

        SecondScreen(
            viewModel = viewModel,
            userId = userId,
            onBack = { navController.popBackStack() }
        )
    }
}

