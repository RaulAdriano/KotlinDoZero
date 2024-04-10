package com.rauladrianoramos.kotlindozero

open class CarroCorrida{

    protected open fun injetarCombustivel(){
        println("injetando combustivel")
    }
    fun acelerar(){
        injetarCombustivel()
        println("Acelerar Carro")
    }
}

class Civic : CarroCorrida(){

    override fun injetarCombustivel(){
        super.injetarCombustivel()
    }
}

class Ferrari : CarroCorrida(){

}


/*
    UBER  (MODULOS)
        - MOTORISTA (APP DIFERENTE)
        - PASSAGEIRO (APP DIFERENTE)

    IFOOD
        - CLIENTE (APP DIFERENTE)
        - RESTAURANTE (APP DIFERENTE)


 */

fun main(){

}