package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema14()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema14() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readln().toInt()
    println("Dame num2:")
    val num2 = readln().toInt()
    println("Dame num3:")
    val num3 = readln().toInt()
    var mayor = 0
    if (num1>num2 && num1>num3 && num1!=num2 && num1!=num3){
        mayor = num1
        println(mayor)
    } else if (num2>num1 && num2>num3 && num2!=num1 && num2!=num3){
        mayor = num2
        println(mayor)
    } else if (num3>num1 && num3>num2 && num3!=num1 && num3!=num2) {
        mayor = num3
        println(mayor)
    } else {
        println("Hay un empate!")
    }
}