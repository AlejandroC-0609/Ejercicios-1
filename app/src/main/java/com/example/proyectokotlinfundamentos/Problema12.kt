package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 12 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema12()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema12() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readln().toInt()
    println("Dame num2:")
    val num2 = readln().toInt()
    println("Dame num3:")
    val num3 = readln().toInt()
    var contador = 0
    if (num1 == num2){
        contador += 2
        if (num2 == num3){
            contador++
        } else if (num1 == num3){
            contador++
        }
    } else if (num2 == num3) {
        contador += 2
        if (num1 == num3) {
            contador++
        }
    } else if (num1==num3){
        contador += 2
    }
    println(contador)
}