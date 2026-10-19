package com.sena.actividad_02.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_02.ui.section.HeaderSection
import com.sena.actividad_02.ui.section.BannerSection
import com.sena.actividad_02.ui.section.CategorySection
import com.sena.actividad_02.ui.theme.BackgroundBlue

@Composable
fun DiscoverScreen(modifier: Modifier = Modifier) {
    // Column principal: organiza toda la pantalla de arriba a abajo
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundBlue),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HeaderSection()
        BannerSection()
        CategorySection()
    }
}