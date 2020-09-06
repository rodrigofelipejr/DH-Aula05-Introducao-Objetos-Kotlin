package br.com.digital.kotlin.exercicio2

class Exercicio2 {
    fun main() {
        val jogador1: JogadorDeFutebol = JogadorDeFutebol("Silva")
        val jogador2: JogadorDeFutebol = JogadorDeFutebol("Souza")

        val sessaoA: SessaoDeTreinamento = SessaoDeTreinamento()
        sessaoA.treinarA(jogador1)

        println()

        val sessaoB: SessaoDeTreinamento = SessaoDeTreinamento()
        sessaoA.treinarA(jogador2)
    }
}