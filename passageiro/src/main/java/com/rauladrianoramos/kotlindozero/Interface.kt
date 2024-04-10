package com.rauladrianoramos.kotlindozero


interface  Presidenciavel{
    fun candidatarSe()
}
abstract class Pessoa{
    fun comer() = println("Comer")

}

class DesenvolvedorAndroid : Pessoa(){
    fun programar() = println("Programar")
}
class DesenvolvedorBackEnd : Pessoa(){
    fun programar() = println("Programar")
}

//uso de interface
// em java seria extends Pessoa e implements Presidenciavel
class Jornalista : Pessoa(), Presidenciavel{
    fun escrever() = println("Escrever")
    override fun candidatarSe() {
        println("fazendo processo para Presidente")
    }
}
class FuncionarioPublico : Pessoa(){}

fun main(){

}