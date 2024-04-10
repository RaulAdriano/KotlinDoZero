package com.rauladrianoramos.kotlindozero

//construtor primario
//class UsuarioSistema constructor(nome: String, sobrenome: String){ --> posso usar constructor, mas nao é obrigatorio
class UsuarioSistema (nome: String, sobrenome: String){

    var nome: String = ""
    var sobrenome: String = ""

    init { //inicializar
        this.nome = nome
        this.sobrenome = sobrenome
        println("Objeto Inicializado")
        println("Nome: $nome - Sobrenome: $sobrenome")
    }

}


fun main(){

    val usuario = UsuarioSistema("Raul","Adriano")
    val usuarioNomeado = UsuarioSistema(sobrenome = "Adriano", nome = "Raul")
}