package com.example.loginapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.loginapp.R

val FuturaNow = FontFamily(
    Font(R.font.futuranow_regular, FontWeight.Normal)
)

val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = FuturaNow,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FuturaNow,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FuturaNow,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )
)
