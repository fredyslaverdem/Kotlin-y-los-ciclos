package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("A:")
    var a = readln().toInt()
    println("B:")
    var b = readln().toInt()

    if (a < b) {
        for (i in a..b) {
            print("$i ")
        }
    } else {
        for (i in a downTo b) {
            print("$i ")
        }
    }
}