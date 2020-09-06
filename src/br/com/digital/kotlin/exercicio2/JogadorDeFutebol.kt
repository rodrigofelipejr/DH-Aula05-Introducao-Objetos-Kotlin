package br.com.digital.kotlin.exercicio2

class JogadorDeFutebol(var nome: String) {
    private var energia: Int = 100
    private var alegria: Int = 50
    private var gols: Int = 0
    private var experiencia: Int = 0

    fun fazerGol() {
        if ((energia - 5) >= 0)
            energia -= 5

        if ((alegria + 10) >= 100)
            alegria += 10

        gols += 1
        println("GOOOOL!")
    }

    fun correr() {
        if ((energia - 10) >= 0)
            energia -= 10

        println("Cansei")
    }

    fun getExperiencia(): Int {
        return experiencia
    }

    fun adicionarExperiencia() {
        experiencia += 1
    }
}