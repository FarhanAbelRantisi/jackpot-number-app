package com.gdgoc.jackpotnumberapp.core.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.gdgoc.jackpotnumberapp.R
import androidx.compose.material3.Typography

// Poppins font family
private val PoppinsFont = FontFamily(
    Font(R.font.poppins_light),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

// Ubuntu Typography
val PoppinsTypography = Typography(
    // Title styles
    titleLarge = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        fontWeight = FontWeight.Normal
    ),

    // Heading styles
    headlineLarge = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold
    ),
    headlineMedium = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Medium
    ),

    // Subhead styles
    displayLarge = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Bold
    ),
    displayMedium = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Medium
    ),
    displaySmall = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        fontWeight = FontWeight.Normal
    ),

    // Text styles
    bodyLarge = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Bold
    ),
    bodyMedium = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Medium
    ),
    bodySmall = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        fontWeight = FontWeight.Normal
    ),

    // Label styles
    labelLarge = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        fontWeight = FontWeight.Bold
    ),

    // Small text
    labelSmall = TextStyle(
        fontFamily = PoppinsFont,
        fontSize = 8.sp,
        lineHeight = 12.sp,
        fontWeight = FontWeight.Normal
    )
)