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
    val num1 = readlnOrNull()?.toDoubleOrNull()
    println("Ingresa valor artículo 2:")
    val num2 = readlnOrNull()?.toDoubleOrNull()
    println("Ingresa valor artículo 3:")
    val num3 = readlnOrNull()?.toDoubleOrNull()

    if (num1!!>0 && num2!!>0 && num3!!>0 ) {
        val neto = num1 + num2 + num3
        val conimp = neto * 1.18
        println("Valor neto: $neto")
        println("Valor total: $conimp")
    }

}