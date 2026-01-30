package com.spironovaai.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.spironovaai.HomeViewModel

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

