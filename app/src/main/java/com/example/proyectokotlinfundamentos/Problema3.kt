package com.example.proyectokotlinfundamentos

// Nombre: Johan Alejanro Carrillo Florian
// Fecha: 01/02/2024
// Descripción: Solución del Problema 3 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    println("Ingresa la asignatura:")
    var asignatura: String = readln()
    println("Ingresa nota primer corte:")
    var a = readln().toDouble()
    println("Ingresa nota segundo corte:")
    var b = readln().toDouble()
    println("Ingresa nota tercer corte:")
    var c = readln().toDouble()
    var d = (a*0.33)+(b*0.33)+(c*0.34)
    println("Asignatura: $asignatura")
    println("Definitiva: $d")
}