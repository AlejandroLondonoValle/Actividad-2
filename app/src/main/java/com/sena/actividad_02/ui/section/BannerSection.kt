package com.sena.actividad_02.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_02.R

@Composable
fun BannerSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(180.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        // 1. La foto de fondo
        Image(
            painter = painterResource(id = R.drawable.banner_guatape),
            contentDescription = "Vista aérea del embalse de Guatapé",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // 2. Sombra degradada para que el texto se lea sobre la foto
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.Black.copy(alpha = 0.6f))
                    )
                )
        )
        // 3. El texto encima, abajo a la izquierda
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {
            Text(
                text = "Explora",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Lugares increíbles cerca de ti",
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}