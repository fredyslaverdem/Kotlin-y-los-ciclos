package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("N:")
    val n = readln().toInt()
    var suma = 0
    if (n > 0) {
        for (i in 1..n) {
            suma += i*i*i
        }
        println("s = $suma")
    } else {
        println("Error")
    }
}