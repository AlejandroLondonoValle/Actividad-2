package com.sena.actividad_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.sena.actividad_02.ui.screen.DiscoverScreen
import com.sena.actividad_02.ui.theme.Actividad_02Theme
import com.sena.actividad_02.ui.theme.BackgroundBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad_02Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = BackgroundBlue
                ) { innerPadding ->
                    DiscoverScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}