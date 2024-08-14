package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    var fac = 1
    var suma = 0

    if (n <= 0) {
        println("Error")
    } else {
        for (i in 1..n) {
            fac *= i
            suma += fac
        }
        println("s = $suma")
    }
}