package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Lavede Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1() {
    // Desarrolle aquí la lógica
    println("Ingresa N:")
    val n = readln().toInt()
    var cont:Int = 1
    var op = 0

    while (op <= n) {
        op = cont * cont
        cont ++
        if (op > n) {
            break
        }
        print("$op ")
    }
}