package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 11 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema11()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema11() {
    // Desarrolle aquí la lógica
    println("Dame el presupuesto:")
    val pre = readln().toInt()
    println("Dame el valor de la comida:")
    val comida = readln().toInt()
    println("Dame el valor de la electricidad:")
    val electricidad = readln().toInt()
    println("Dame el valor del internet:")
    val internet = readln().toInt()
    println("Dame el valor del arriendo:")
    val arriendo = readln().toInt()
    val gastos = comida+electricidad+internet+arriendo
    if (pre<gastos){
        println("Rayos estoy quebrado(a)!")
    } else {
        println("Vamos melos!")
    }
}