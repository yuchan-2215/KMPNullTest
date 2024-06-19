package com.example.nullpointertest.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.nullpointertest.Games
import com.example.nullpointertest.routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Content()
            }
        }
    }
}

@Composable
fun Content(){
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        var text by remember { mutableStateOf("") }
        Text(text = text)

        Button(onClick = { text = routes.first().name }) {
            Text(text = "Out Test")
        }
        Button(onClick = { text = Games.companionRoutes.first().name }) {
            Text(text = "Companion Test")
        }
    }
}