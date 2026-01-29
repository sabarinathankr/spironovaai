package com.spironovaai.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.spironovaai.HomeViewModel

@Composable
fun SecondScreen(
    viewModel: HomeViewModel,
    userId: String?,
    onBack: () -> Unit
) {

   /* LaunchedEffect(userId) {
        viewModel.loadUser(userId)
    }*/

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Second Screen")
        Text(text = "UserId: $userId")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onBack) {
            Text("Go Back")
        }
    }
}

