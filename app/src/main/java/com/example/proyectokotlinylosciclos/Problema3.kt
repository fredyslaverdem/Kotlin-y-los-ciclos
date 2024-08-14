package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 3 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var suma = 0

    while (n != 0) {
        suma += n
        println("n:")
        n = readln().toInt()
    }
    println("Suma = $suma")
}