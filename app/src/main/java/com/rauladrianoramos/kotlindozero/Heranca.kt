package com.rauladrianoramos.kotlindozero


//SuperClass ou classe pai
open class Animal {
    var cor = ""
    var tamanho = "" //pequeno,medio,grande porte
    var peso = 0.0

    open fun correr() {
        print("correr como um ")
    }

    fun dormir() {}
}

//: Animal() - Herança - : seria igual extends em Java
//subClass ou classe filha
class Cao : Animal() {

    fun latir() {
        println("latir")
    }

    override fun correr() {
        super.correr()
        println("Cao de 4 patas")
    }

}

class Passaro : Animal() {

    fun voar() {
        println("voar")
    }

    override fun correr() {
        super.correr()
        println("Passaro de 2 patas")
    }
}

fun main() {

    val cao = Cao()
    cao.latir()
    cao.correr()

    val passaro = Passaro()
    passaro.voar()
    passaro.correr()

}