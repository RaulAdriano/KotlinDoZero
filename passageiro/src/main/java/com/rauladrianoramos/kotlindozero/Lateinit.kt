package com.rauladrianoramos.kotlindozero


class Produto{

    //inicializar depois - NAO ESQUECER, POIS SE ACESSAR DESCRICAO SEM INICIALIZAR O MESMO GERARÁ UM ERRO
    lateinit var descricao: String
}


fun main(){

    val produto = Produto()
    produto.descricao = "Notebook"

    println(produto.descricao)

}