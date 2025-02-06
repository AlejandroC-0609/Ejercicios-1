package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 7 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("¿Cuántos sonidos del grillo escuchaste por minuto?")
    val sonidos = readln().toDouble()
    val temp = (sonidos/4.0)+40.0
    if (sonidos < 0){
        println("Seguro investigador, ¿un grillo puede hacer ese número de sonidos?")
    } else{
        println("Dados los sonidos del grillo, la temperatura es de $temp °F.")
    }

}