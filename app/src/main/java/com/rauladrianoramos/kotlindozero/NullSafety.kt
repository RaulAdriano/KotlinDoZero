package com.rauladrianoramos.kotlindozero

class Carro {

    var cor = "Vermelho"

    fun acelerar() {
        //***
    }
}

fun main() {

//    // carro nulo
//    val carro: Carro
//    println( carro.cor )

//    //carro pode ser null usando ?
//    var carro: Carro? = null
//    //carro = Carro()
//    println( carro.cor )

//    //carro?.cor é chamada segura, valida automaticamente se carro é null
//    var carro: Carro? = null
//    println(carro?.cor)

    var  carro:Carro? = null

    val cor  = carro?.cor ?: "cor padrao"  //se for nulo adiciona a cor padrao
    println(cor)

}