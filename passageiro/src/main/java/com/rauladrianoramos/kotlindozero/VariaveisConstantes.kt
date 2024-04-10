package com.rauladrianoramos.kotlindozero

const val nomeUsuario = "raulAdriano" // constante tempo de compilação - global

fun retornaNomeUsuario(){

}

class Usuario{

}


fun main (){
    /*
    * VARIAVEIS
    * var  =  posso mudar o valor
    * val  = constante
    * */


    val nome =  "Raul" // constante tempo de execução
    val nomeRetorno =  retornaNomeUsuario()
    val usuario = Usuario()

    var idade = 29
    idade = 30

    println(nome)
    println(idade)


    val numero1 = 20;
    val numero2 = 10;
    val resultado = numero1 + numero2

    val numeroInteiro : Int = 10;

    println(resultado)
}