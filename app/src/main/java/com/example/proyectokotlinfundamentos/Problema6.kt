package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 6 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    val numero = readln().toInt()
    val unidad = numero % 10
    val decena = (numero/10) % 10
    val centena = ((numero/10)/10)
    val suma = unidad+decena+centena
    println("La suma de los dígitos del número $numero es igual a $suma.")

}