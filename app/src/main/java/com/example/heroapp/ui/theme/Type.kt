package com.example.heroapp.ui.theme

import android.content.Context
import android.content.res.Resources
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import com.example.heroapp.R

val Cabin = FontFamily(
    Font(R.font.aldrich, FontWeight.Medium),
   Font(R.font.lobster, FontWeight.Bold)
)



// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = Cabin,
    h1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )
)