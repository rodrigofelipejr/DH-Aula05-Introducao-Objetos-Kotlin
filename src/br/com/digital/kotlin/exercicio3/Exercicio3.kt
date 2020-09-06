package br.com.digital.kotlin.exercicio3

class Exercicio3 {
    fun main() {
        val atleta1: Atleta = Atleta("Silva", 99, 100)
        val atleta2: Atleta = Atleta("Santos", 45, 35)

        val prova1: Prova = Prova(75, 40)
        val prova2: Prova = Prova(65, 10)
        val prova3: Prova = Prova(10, 10)

        println("${atleta1.nome} - [nvl: ${atleta1.nivel} - ene: ${atleta1.energia}]")
        println("${atleta2.nome} - [nvl: ${atleta2.nivel} - ene: ${atleta2.energia}]")

        println()

        println(
            "Prova 1 [dif: ${prova1.dificuldade}, ene: ${prova1.energiaNecessaria}] - Atleta: ${atleta1.nome}, pode realizar a prova? ${
                prova1.podeRealizar(
                    atleta1
                )
            }"
        )
        println(
            "Prova 1 [dif: ${prova1.dificuldade}, ene: ${prova1.energiaNecessaria}] - Atleta: ${atleta2.nome}, pode realizar a prova? ${
                prova1.podeRealizar(
                    atleta2
                )
            }"
        )

        println()

        println(
            "Prova 2 [dif: ${prova2.dificuldade}, ene: ${prova2.energiaNecessaria}] - Atleta: ${atleta1.nome}, pode realizar a prova? ${
                prova2.podeRealizar(
                    atleta1
                )
            }"
        )
        println(
            "Prova 2 [dif: ${prova2.dificuldade}, ene: ${prova2.energiaNecessaria}] - Atleta: ${atleta2.nome}, pode realizar a prova? ${
                prova2.podeRealizar(
                    atleta2
                )
            }"
        )

        println()

        println(
            "Prova 3 [dif: ${prova3.dificuldade}, ene: ${prova3.energiaNecessaria}] - Atleta: ${atleta1.nome}, pode realizar a prova? ${
                prova3.podeRealizar(
                    atleta1
                )
            }"
        )
        println(
            "Prova 3 [dif: ${prova3.dificuldade}, ene: ${prova3.energiaNecessaria}] - Atleta: ${atleta2.nome}, pode realizar a prova? ${
                prova3.podeRealizar(
                    atleta2
                )
            }"
        )
    }
}