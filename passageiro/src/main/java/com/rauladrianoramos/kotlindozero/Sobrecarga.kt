package com.rauladrianoramos.kotlindozero


class User{
    //propriedades


    fun logar(email: String, senha: String){
        println("Usuario logado com email: $email e senha: $senha")
    }

    //sobrecarga
    fun logar(numeroTelefone: String){
        println("Usuario logado com telefone: $numeroTelefone")
    }

}
fun main(){

    val usuario = User()
    usuario.logar("abc@gmail","123Mudar@")
    usuario.logar("44912345678")

}