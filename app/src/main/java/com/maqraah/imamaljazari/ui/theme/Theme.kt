package com.maqraah.imamaljazari.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColors = darkColorScheme(
    primary = Color(0xFF105C3B),
    secondary = Color(0xFF18794E),
    tertiary = Color(0xFF2A6B57),
    background = Color(0xFF081E16),
    surface = Color(0xFF0E2C22),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

private val LightColors = lightColorScheme(
    primary = Color(0xFF105C3B),
    secondary = Color(0xFF18794E),
    tertiary = Color(0xFF2F8D66),
    background = Color(0xFFDDF2E3),
    surface = Color(0xFFF5FBF7),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFF0E1D18),
    onSurface = Color(0xFF0E1D18)
)

@Composable
fun MaqraahTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
