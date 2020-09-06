package br.com.digital.exemplo.Exercicio1

class Conta(var numeroConta: Int, var titular: Cliente) {
    private var saldo: Double = 0.0

    fun depositar(valor: Double) {
        saldo += valor
        println("Depósito de R$ $valor, realizado com sucesso! Novo saldo: R$ $saldo")
    }

    fun saque(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente para saque de R$ $valor. Saldo atual: R$ $saldo")
        } else {
            saldo -= valor
            println("Saque de R$ $valor, realizado com sucesso! Novo saldo: R$ $saldo")
        }
    }
}