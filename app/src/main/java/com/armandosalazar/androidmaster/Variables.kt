package com.armandosalazar.androidmaster

fun main() {
    // Variables & Constants (Values)
    var name = "Armando"
    name = "Armando Salazar"
    val age: Int = 23
    val example: Long = 23L
    val floatExample: Float = 23.0F
    val doubleExample: Double = 23.0
    val isAdult: Boolean = true
    val charExample: Char = 'A'
    val stringExample: String = "Armando Salazar"
    val nullExample: String? = null

    val convertedAge: String = age.toString()
    val convertedFloat: Float = age.toFloat()

    print("Hi, my name is $name and I'm $age years old.\n")
    println("The sum of 2 and 3 is ${sum(2.toDouble(), 3.toDouble())}")
}

// Functions
fun sum(a: Double, b: Double): Double {
    return a + b
}