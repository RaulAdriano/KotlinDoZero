package com.rauladrianoramos.kotlindozero

//Abstração
//Pessoa: cpf, nome, idade, ...
//Cachorro: nome, raça, peso, porte, ...

class Jogador{

    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar(aceleracao: Int){
        println("acelerar na velocidade: $aceleracao")
    }

    //funcao Inline
    fun retornarPoder(): String = "Casco vermelho"
}

fun main(){

    val jogador = Jogador()
    jogador.kart = "Kart do Mario"
    jogador.acelerar(50)
    println(jogador.retornarPoder())


}