package br.com.digital.kotlin.exercicio5

import br.com.digital.kotlin.exercicio5.Cliente
import br.com.digital.kotlin.exercicio5.Veiculo
import br.com.digital.kotlin.exercicio5.Venda

class Concessionaria {
    private lateinit var vendas: ArrayList<Venda>

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        val venda: Venda = Venda(cliente, veiculo, valor)
        vendas.add(venda)
    }
}