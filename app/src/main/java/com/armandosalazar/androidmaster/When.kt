package com.armandosalazar.androidmaster

fun main() {
    val isSunny = true

    when (!isSunny) {
        true -> println("It's not sunny!")
        else -> {
            println("It's sunny!")
        }
    }
}