package pl.mechaniak.a30daysapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import pl.mechaniak.a30daysapp.R

val AntonRegular = FontFamily(
    Font(R.font.anton_regular)
)

val Lexend = FontFamily(
    Font(R.font.lexendgiga_medium)
)
val Outfit = FontFamily(
    Font(R.font.outfit_regular)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AntonRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Outfit,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),

    displaySmall = TextStyle(
        fontFamily = Outfit,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)