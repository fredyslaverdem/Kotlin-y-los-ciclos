package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var cont = 0

    while (n != -1) {
        if (n % 2 == 0) {
            cont ++
        }
        println("n:")
        n = readln().toInt()
    }
    println("Pares = $cont")

}