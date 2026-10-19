package com.sena.actividad_02.ui.section

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_02.R
import com.sena.actividad_02.ui.composable.DestinationCard
import com.sena.actividad_02.ui.composable.SectionTitle

@Composable
fun PopularDestinationsSection(modifier: Modifier = Modifier) {
    // Datos locales de los destinos
    val destinations = listOf(
        Destination(
            imageRes = R.drawable.reservoir,
            name = "Embalse del Peñol",
            category = "Naturaleza",
            rating = 4.8,
            description = "Aguas tranquilas e islas verdes para recorrer en lancha."
        ),
        Destination(
            imageRes = R.drawable.town,
            name = "Pueblo de El Peñol",
            category = "Cultura",
            rating = 4.6,
            description = "Calles coloridas y zócalos llenos de historia."
        ),
        Destination(
            imageRes = R.drawable.rock,
            name = "Piedra del Peñol",
            category = "Aventura",
            rating = 4.9,
            description = "Cientos de escalones hasta la mejor vista del embalse."
        )
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        SectionTitle(title = "Destinos populares", action = "Ver todos")

        LazyColumn(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(destinations, key = { destination -> destination.name }) { destination ->
                DestinationCard(
                    imageRes = destination.imageRes,
                    name = destination.name,
                    category = destination.category,
                    rating = destination.rating,
                    description = destination.description
                )
            }
        }
    }
}

// Molde de los datos de un destino. Es privado: solo se usa en este archivo.
private data class Destination(
    @DrawableRes val imageRes: Int,
    val name: String,
    val category: String,
    val rating: Double,
    val description: String
)