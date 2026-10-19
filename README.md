# Actividad 02 – Descubre Guatapé

Pantalla de destinos turísticos de Guatapé y El Peñol (Antioquia), hecha con Kotlin y Jetpack Compose.
Programa ADSO – SENA. Autor: Luis Alejandro Londoño Valle.

## Componentes usados
- **Column**: organiza la pantalla principal.
- **Image**: banner, foto de perfil y miniaturas, con `contentScale` y `contentDescription`.
- **LazyRow + items()**: categorías que se desplazan horizontalmente.
- **LazyColumn + items()**: destinos que se desplazan verticalmente, con `key` estable.
- **Row**: organiza imagen y textos en cada tarjeta.

## Estructura
- `ui/screen/DiscoverScreen.kt`: Column principal que ordena las secciones.
- `ui/section/`: HeaderSection, BannerSection, CategorySection, PopularDestinationsSection.
- `ui/composable/`: CategoryItem, SectionTitle, DestinationCard.
- `ui/theme/Color.kt`: paleta azul.

## Ramas (Gitflow)
`feature/header` → `feature/banner` → `feature/categories` → `feature/popular-destinations` → `release/1.0.0` → `main` (tag `v1.0.0`).