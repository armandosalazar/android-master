package com.armandosalazar.androidmaster

fun main() {
    val daysOfWeekReadOnly: List<String> = listOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )

    val favoritesDays: MutableList<String> = mutableListOf()
    favoritesDays.add(0, "Monday")
    favoritesDays.add("Friday")
    println("favoritesDays: $favoritesDays")

    daysOfWeekReadOnly.filter { it == "Monday" }.forEach { println(it) }
    daysOfWeekReadOnly.forEach { println(it) }
    daysOfWeekReadOnly.forEach { day ->
        println(day)
    }

    println(daysOfWeekReadOnly[0])
    println(daysOfWeekReadOnly.size)

    for (day in daysOfWeekReadOnly) {
        println(day)
    }

    for (index in daysOfWeekReadOnly.indices) {
        println(daysOfWeekReadOnly[index])
    }

    daysOfWeekReadOnly.forEach { day ->
        println(day)
    }

    daysOfWeekReadOnly.forEachIndexed { index, day ->
        println("$index: $day")
    }
}