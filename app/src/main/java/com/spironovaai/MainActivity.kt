package com.spironovaai

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.spironovaai.base.SpiroBaseActivity
import com.spironovaai.navigation.AppNavHost
import com.spironovaai.ui.theme.SpiroNovaAiTheme

class MainActivity : SpiroBaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            enableEdgeToEdge()


            SpiroNovaAiTheme {
                Greeting()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    val navController = rememberNavController()

    AppNavHost(
        navController = navController,
        modifier = Modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SpiroNovaAiTheme {
        Greeting()
    }
}