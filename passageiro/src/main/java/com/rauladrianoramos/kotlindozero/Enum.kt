package com.rauladrianoramos.kotlindozero

//aguardando_aprovacao, pedido_realizado , pagamento_confirmado, pedido_enviado, pedido_entregue
class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {


}


enum class StatusPedido{
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}

fun main() {

    val pedido = Pedido(125.90, "Camiseta,livro")

    //pagamento com cartao
    pedido.statusPedido = StatusPedido.PAGAMENTO_CONFIRMADO

    //transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO

    println(pedido.statusPedido.ordinal)
    println(pedido.statusPedido)

    //Historico de compras
    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO) {
        println("O seu pedido foi realizado")
    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("O seu pedido foi ENVIADO")
    }else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO) {
        println("O seu PAGAMENTO foi confirmado")
    }

}