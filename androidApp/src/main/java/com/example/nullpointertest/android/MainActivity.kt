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
import androidx.compose.ui.tooling.preview.Preview
import com.example.nullpointertest.GameLib

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    var text by remember { mutableStateOf("") }
                    Text(text = text)

                    val gameLib = GameLib()
                    Button(onClick = { text = gameLib.outTest() }) {
                        Text(text = "Out Test")
                    }
                    Button(onClick = { text = gameLib.companionTest() }) {
                        Text(text = "Companion Test")
                    }
                }
            }
        }
    }
}
