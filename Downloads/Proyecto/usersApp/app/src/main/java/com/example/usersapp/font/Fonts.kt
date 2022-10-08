package com.example.usersapp.font

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.usersapp.R

class Fonts {
    val FiraSansFamily = FontFamily(
        Font(R.font.aguafina_script, FontWeight.Light),
        Font(R.font.aguafina_script, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.aguafina_script, FontWeight.Medium),
        Font(R.font.aguafina_script, FontWeight.Bold)
    )
}