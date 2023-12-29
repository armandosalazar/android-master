package com.armandosalazar.androidmaster.syntax

fun main() {
    val daysOfWeek =
        arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    daysOfWeek[0] = "MONDAY"

    println(daysOfWeek[0])
    println(daysOfWeek.size)

    for (day in daysOfWeek) {
        println(day)
    }

    for (index in daysOfWeek.indices) {
        println(daysOfWeek[index])
    }

    daysOfWeek.forEach { day ->
        println(day)
    }

    daysOfWeek.forEachIndexed { index, day ->
        println("$index: $day")
    }
}