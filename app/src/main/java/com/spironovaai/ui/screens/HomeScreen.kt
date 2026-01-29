package com.spironovaai.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.navigation.NavController
import com.spironovaai.HomeViewModel
import com.spironovaai.navigation.NavRoutes

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    onNavigateToSecond: (String) -> Unit
) {

    Column {
        Text("Home Screen")

        Button(onClick = {
            val userId = viewModel.getUserId()
            onNavigateToSecond(userId)
        }) {
            Text("Go to Second")
        }
    }
}

