package com.example.onepieceensiklopedia.model

import androidx.annotation.DrawableRes

data class OnePiece(
    val title: String,
    val description: String,
    @DrawableRes val photo: Int
)