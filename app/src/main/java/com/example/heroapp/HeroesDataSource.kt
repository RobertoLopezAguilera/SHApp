package com.example.heroapp

import com.example.heroapp.R
import com.example.heroapp.ui.theme.Hero


object HeroesRepository{
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1,
            descripRes = R.string.description1,
            imgRes = R.drawable.android_superhero1
        ),
        Hero(
            nameRes = R.string.hero2,
            descripRes = R.string.description2,
            imgRes = R.drawable.android_superhero2
        ),
        Hero(
            nameRes = R.string.hero3,
            descripRes = R.string.description3,
            imgRes = R.drawable.android_superhero3
        ),
        Hero(
            nameRes = R.string.hero4,
            descripRes = R.string.description4,
            imgRes = R.drawable.android_superhero4
        ),
        Hero(
            nameRes = R.string.hero5,
            descripRes = R.string.description5,
            imgRes = R.drawable.android_superhero5
        ),
        Hero(
            nameRes = R.string.hero6,
            descripRes = R.string.description6,
            imgRes = R.drawable.android_superhero6
        )
    )
}