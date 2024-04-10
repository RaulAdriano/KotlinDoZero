package com.rauladrianoramos.kotlindozero

fun somarComParametro(numero1: Int, numero2: Int) {
    println(numero1 + numero2)
}

fun main() {
    somarComParametro(10, 20)

    // parametros nomeados, posso colocar em ordem diferente da declarada
    somarComParametro(numero2 = 20, numero1 = 10)
}