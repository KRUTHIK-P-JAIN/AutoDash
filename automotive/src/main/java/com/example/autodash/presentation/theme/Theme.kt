package com.example.autodash.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryBlue,
    background = BackgroundDark,
    surface = CardDark,
    onPrimary = Color.White,
    onBackground = TextWhite,
    onSurface = TextWhite
)

@Composable
fun AutoDashTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) DarkColorScheme else DarkColorScheme
    MaterialTheme(
        colorScheme = colors,
        typography = Typography(),
        content = content
    )
}
