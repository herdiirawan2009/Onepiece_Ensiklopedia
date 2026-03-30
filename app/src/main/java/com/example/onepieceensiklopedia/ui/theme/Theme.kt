package com.example.onepieceensiklopedia.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val OnePieceColorScheme = lightColorScheme(
    primary = RedPrimary,
    secondary = GoldSecondary,
    background = BackgroundLight,
    surface = SurfaceWhite,
    onSurface = OnSurfaceText
)

@Composable
fun OnePieceEnsiklopediaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = OnePieceColorScheme,
        typography = AppTypography,
        content = content
    )
}