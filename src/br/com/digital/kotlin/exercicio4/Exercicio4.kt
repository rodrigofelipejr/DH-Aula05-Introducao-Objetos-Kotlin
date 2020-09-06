package br.com.digital.kotlin.exercicio4

class Exercicio4 {
    fun main() {
        println("criando...")
        val tripe: Tripe = Tripe(30, 100)

        println()

        println("usar...")
        tripe.usar()

        println()

        println("desdobrar...")
        tripe.desdobrar()

        println()

        println("usar...")
        tripe.usar()

        println()

        println("nova altura...")
        tripe.definirAltura(88)

        println()

        println("usar...")
        tripe.usar()

        println()

        println("guardar...")
        tripe.guardar()

        println()

        println("dobrando...")
        tripe.dobrar()

        println()

        println("guardar...")
        tripe.guardar()

        println()

        println("nova altura...")
        tripe.definirAltura(tripe.alturaMinima)

        println()

        println("guardar...")
        tripe.guardar()

    }
}