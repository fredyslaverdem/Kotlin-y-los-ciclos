package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var mayor = 0
    var indice = 1
    var mayori = 0

    while (n != 0) {
        if (n > mayor){
            mayor = n
            mayori = indice
        }
        indice ++
        println("n:")
        n = readln().toInt()

    }
    println("Posición del mayor = $mayori")
}