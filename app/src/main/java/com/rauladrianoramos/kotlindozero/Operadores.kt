package com.rauladrianoramos.kotlindozero

fun main(){

    val n1 = 10
    val n2 = 20

    val resultadoSoma = n1 + n2
    println(resultadoSoma)

    val resultadoSub = n1 - n2
    println(resultadoSub)

    val resultadoDiv = n1 / n2
    println(resultadoDiv)

    val resultadoMult = n1 * n2
    println(resultadoMult)

    //operadores relacionais

    val maior = n1 > n2
    println(maior)

    val menor = n1 < n2
    println(menor)

    val igual = n1 == n2
    println(igual)

    //logicos

    //and
    val result = n1 > n2 && 1 > 20
    println(result)

    //or
    val result2 = n1 > n2 || 1 < 20
    println(result2)

    //-----------------------------------------------

    val idade = 50
    val compras = 300

    //maior igual
    println(idade >= 50 && compras >= 400)

    //maior igual
    println(idade >= 50 || compras >= 400)

    val maior50 = idade > 50
    println(!maior50)

}