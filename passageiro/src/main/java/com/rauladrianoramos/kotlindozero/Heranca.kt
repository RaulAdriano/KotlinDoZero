package com.rauladrianoramos.kotlindozero


//SuperClass, classe pai, abstrata
abstract class Animal {
    var cor = ""
    var tamanho = "" //pequeno,medio,grande porte
    var peso = 0.0

    open fun correr() {
        print("correr como um ")
    }

    abstract fun dormir()
}

//: Animal() - Herança - : seria igual extends em Java
//subClass ou classe filha, concreta
class Cao : Animal() {

    fun latir() {
        println("latir")
    }

    override fun correr() {
        super.correr()
        println("Cao de 4 patas")
    }

    override fun dormir() {
        println("Cão - Dormir")
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

    override fun dormir() {
        println("Passaro - Dormir")
    }
}

fun main() {

    val cao = Cao()
    cao.latir()
    cao.correr()
    cao.dormir()

    val passaro = Passaro()
    passaro.voar()
    passaro.correr()
    passaro.dormir()

}