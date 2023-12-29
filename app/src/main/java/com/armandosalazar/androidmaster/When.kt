package com.armandosalazar.androidmaster

fun main() {
    val isSunny = true

    when (!isSunny) {
        true -> println("It's not sunny!")
        else -> {
            println("It's sunny!")
        }
    }

    println(getWeatherDescription(12)) // positional parameter
    println(getWeatherDescription(temperature = 25)) // named parameter
    println(getType(obj = 1))
}

fun getWeatherDescription(temperature: Int): String {
    return when (temperature) {
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "Cold" // comma separated values
        in 11..20 -> "Mild" // range
        in 21..30 -> "Warm"
        !in 31..40 -> "Hot" // negation
        else -> "Hot"
    }
}

fun getType(obj: Any): String {
    return when (obj) {
        is Int -> "Integer" // type check
        is String -> "String"
        is Boolean -> "Boolean"
        else -> "Unknown"
    }
}