package com.rauladrianoramos.kotlindozero

class CarroCompanion(var modelo: String = "", var velocidade: Int = 0) {

    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemVelocidadeMaxima() {
            println("Velocida maxima permitida: $VELOCIDADE_MAX_PERMITIDA")
        }
    }

    fun exibirInformacoes() {
        println("Informacoes: $modelo e $velocidade")
    }
}


class UsuarioCompanion {

    companion object {

        fun verificarUsuarioLogado() : Boolean {
            return true
        }
    }
}

fun main() {

    val fusca = CarroCompanion("Fusca", 100)
    fusca.exibirInformacoes()

    val ferrari = CarroCompanion("Ferrari", 300)
    ferrari.exibirInformacoes()

    println("PI: ${Math.PI}")

    CarroCompanion.exibirMensagemVelocidadeMaxima()


    println("Usuario logado: ${UsuarioCompanion.verificarUsuarioLogado()}")


}