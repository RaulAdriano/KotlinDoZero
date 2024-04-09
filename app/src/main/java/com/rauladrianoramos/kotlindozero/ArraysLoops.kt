package com.rauladrianoramos.kotlindozero

fun main() {

    //criacao de um Array
    val nomes = arrayOf("Raul", "Mary")
    nomes[1] = "Maryellen" //posso trocar valores mesmo sendo um val
    println(nomes[1])

    //while
    var numero = 1
    while (numero <= 5) {
        println("WHILE --> executou: $numero")
        numero++
    }

    //for
    for (numero in 1..5) {
        println("FOR --> executou: $numero")
    }

    val postagens = arrayOf("Viagem para praia", "passeio de barco", "Emprego novo")

    //for com Array
    for (postagem in postagens) {
        println("POSTAGEM : $postagem")
    }

    //for com Array e indice
    for ((indice, postagem) in postagens.withIndex()) {
        println("POSTAGEM $indice : $postagem")
    }
}