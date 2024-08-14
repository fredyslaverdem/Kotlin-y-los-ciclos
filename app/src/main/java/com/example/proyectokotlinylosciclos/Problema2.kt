package com.example.proyectokotlinylosciclos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 15/08/2024
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Desarrolle aquí la lógica
    println("Ingresa x:")
    var x = readln().toDouble()
    println("Ingresa y:")
    var y = readln().toDouble()

    var dias = 1
    var dx = x
    while (dx < y) {
        dx *= 1.10
        dias ++
    }
    println("Necesitas $dias días para correr bien los ${y.toInt()} Km")
}