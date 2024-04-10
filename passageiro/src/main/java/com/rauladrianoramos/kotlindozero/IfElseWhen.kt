package com.rauladrianoramos.kotlindozero

fun main(){

    val notaAluno = 5
    val condicao = notaAluno >= 7

    if (condicao){
        println("Aluno Aprovado")
    }else{
        println("Aluno Reprovado")
    }

    //IF
    val opcao = 1

    if(opcao == 1){
        println("Cartao crédito")
    }else if (opcao == 2){
        println("Extrato")
    }else if (opcao == 3){
        println("Saldo")
    }else{
        println("Nenhuma opção selecionada")
    }

    //if com IN
    val opcaoAtendimento = 1

    if(opcaoAtendimento in 1..3){
        println("opções selecionadas: 1, 2 e 3")
    }else if (opcaoAtendimento in 4..8){
        println("opções selecionadas: 4, 5, 6, 7 e 8")
    }else{
        println("Nenhuma opção selecionada")
    }

    //when
    val opcaoMenu = 4

    when(opcaoMenu) {
        1 -> println("Cartao crédito")
        2 -> println("Extrato")
        in 3..5 -> println("Saldo")
        else -> println("Nenhuma opção selecionada")
    }


}
