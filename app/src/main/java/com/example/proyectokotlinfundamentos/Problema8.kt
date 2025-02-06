package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 8 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("Dame la base:")
    val base = readln().toDouble()
    println("Dame el exponente:")
    val exp = readln().toDouble()
    if (Math.pow(base,exp)>5000){
        println("Muy grande.")
    } else {
        println("Números óptimos.")
    }
}