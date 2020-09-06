package br.com.digital.kotlin.exercicio2

class SessaoDeTreinamento {
    private var experiencia: Int = 0

    fun treinarA(jogador: JogadorDeFutebol) {
        val experienciaAtual:Int = jogador.getExperiencia()

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.adicionarExperiencia()

        println("Treino completado! A experiencia inicial de $experienciaAtual foi para ${jogador.getExperiencia()}")
    }
}