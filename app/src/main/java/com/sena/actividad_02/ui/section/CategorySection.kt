package com.sena.actividad_02.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sena.actividad_02.ui.composable.CategoryItem

@Composable
fun CategorySection() {
    // Datos locales: cada par es (emoji, nombre)
    val categories = listOf(
        "🏔️" to "Monolito",
        "🛥️" to "Tours",
        "🌅" to "Embalse",
        "🏘️" to "Pueblito",
        "♥️" to "Favoritos"
    )

    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(categories) { category ->
            CategoryItem(emoji = category.first, name = category.second)
        }
    }
}