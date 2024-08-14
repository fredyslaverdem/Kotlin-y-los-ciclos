package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 8 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    var fac = 1

    if (n == 0) {
        println("$n ! = 1")
    } else {
        for (i in 1..n) {
            fac *= i
        }
        println("$n ! = $fac")
    }
}