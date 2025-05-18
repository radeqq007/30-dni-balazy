import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import pl.mechaniak.a30daysapp.R

data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val dayOfTheMonth: String,
    @StringRes val Desc: Int
)

    val days = listOf(
        Day(R.drawable.cat1, R.string.day1, "Dzień 1", R.string.day1_description),
        Day(R.drawable.cat2, R.string.day2, "Dzień 2", R.string.day2_description),
        Day(R.drawable.cat3, R.string.day3, "Dzień 3", R.string.day3_description),
        Day(R.drawable.cat4, R.string.day4, "Dzień 4", R.string.day4_description),
        Day(R.drawable.cat5, R.string.day5, "Dzień 5", R.string.day5_description),
        Day(R.drawable.cat6, R.string.day6, "Dzień 6", R.string.day6_description),
        Day(R.drawable.cat1, R.string.day7, "Dzień 7", R.string.day7_description),
        Day(R.drawable.cat2, R.string.day8, "Dzień 8", R.string.day8_description),
        Day(R.drawable.cat3, R.string.day9, "Dzień 9", R.string.day9_description),
        Day(R.drawable.cat4, R.string.day10, "Dzień 10", R.string.day10_description),
        Day(R.drawable.cat5, R.string.day11, "Dzień 11", R.string.day11_description),
        Day(R.drawable.cat6, R.string.day12, "Dzień 12", R.string.day12_description),
        Day(R.drawable.cat3, R.string.day13, "Dzień 13", R.string.day13_description),
        Day(R.drawable.cat1, R.string.day14, "Dzień 14", R.string.day14_description),
        Day(R.drawable.cat2, R.string.day15, "Dzień 15", R.string.day15_description),
        Day(R.drawable.cat3, R.string.day16, "Dzień 16", R.string.day16_description),
        Day(R.drawable.cat4, R.string.day17, "Dzień 17", R.string.day17_description),
        Day(R.drawable.cat5, R.string.day18, "Dzień 18", R.string.day18_description),
        Day(R.drawable.cat1, R.string.day19, "Dzień 19", R.string.day19_description),
        Day(R.drawable.cat2, R.string.day20, "Dzień 20", R.string.day20_description),
        Day(R.drawable.cat3, R.string.day21, "Dzień 21", R.string.day21_description),
        Day(R.drawable.cat4, R.string.day22, "Dzień 22", R.string.day22_description),
        Day(R.drawable.cat5, R.string.day23, "Dzień 23", R.string.day23_description),
        Day(R.drawable.cat6, R.string.day24, "Dzień 24", R.string.day24_description),
        Day(R.drawable.cat1, R.string.day25, "Dzień 25", R.string.day25_description),
        Day(R.drawable.cat2, R.string.day26, "Dzień 26", R.string.day26_description),
        Day(R.drawable.cat3, R.string.day27, "Dzień 27", R.string.day27_description),
        Day(R.drawable.cat4, R.string.day28, "Dzień 28", R.string.day28_description),
        Day(R.drawable.cat5, R.string.day29, "Dzień 29", R.string.day29_description),
        Day(R.drawable.cat6, R.string.day30, "Dzień 30", R.string.day30_description)
    )
