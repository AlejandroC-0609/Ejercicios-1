package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 15 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema15()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema15() {
    // Desarrolle aquí la lógica
    println("Dame un numero de 4 cifras:")
    val numero = readln().toString()
    var rev = numero.reversed()
    if (numero==rev){
        println("SÍ")
    } else {
        println("NO")
    }
}