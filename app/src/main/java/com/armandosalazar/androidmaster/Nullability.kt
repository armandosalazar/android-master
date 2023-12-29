package com.armandosalazar.androidmaster

fun main() {
    val name: String? = null

    // print(name!!.get(0)) // non-null assertion operator
    println(name?.get(0) ?: "is null") // safe call operator, elvis operator

}