package com.example.heroapp.ui.theme

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descripRes: Int,
    @DrawableRes val imgRes: Int
)