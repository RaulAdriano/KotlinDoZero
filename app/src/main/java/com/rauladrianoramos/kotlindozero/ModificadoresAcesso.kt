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


fun main(){

}