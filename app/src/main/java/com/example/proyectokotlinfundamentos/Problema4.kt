package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 4 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    println("Ingresa valor artículo 1:")
    val a = readln().toFloat()
    println("Ingresa valor artículo 2:")
    val b = readln().toFloat()
    println("Ingresa valor artículo 3:")
    val c = readln().toFloat()
    val imp = (a+b+c)*0.18
    println("Valor neto: ${a+b+c} \n Valor total: ${a+b+c+imp}")
}