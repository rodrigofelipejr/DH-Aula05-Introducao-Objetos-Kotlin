package br.com.digital.kotlin.exercicio3

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean {
        val nivel: Boolean = atleta.nivel >= dificuldade
        val energia: Boolean = atleta.energia >= energiaNecessaria

        return nivel && energia
    }
}