package br.com.digital.kotlin.exercicio4

class Tripe(var alturaMinima: Int, var alturaMaxima: Int) {
    private var dobrado: Boolean = true
    private var alturaAtual: Int = 0

    init {
        println("Tipe criado [altMin: ${alturaMaxima} - altMax: ${alturaMaxima} - dobrado: ${dobrado} - altAtu: ${alturaAtual}]")
    }

    fun definirAltura(novaAltura: Int) {
        alturaAtual = novaAltura
        println("Definindo altura para: ${alturaAtual}cm.")
    }

    fun alturaAtual(): Int {
        println("Altura atual: ${alturaAtual}cm.")
        return alturaAtual
    }

    fun dobrar() {
        dobrado = true
        println("O tipe foi dobrado.")
    }

    fun desdobrar() {
        dobrado = false
        println("O tipe foi desdobrado.")
    }

    fun guardar() {
        if(!prontoParaGuardar()){
            println("O tripe não está pronto para ser guardado.")
            return
        }

        println("O tipe foi guardado.")
    }

    fun prontoParaGuardar():Boolean {
        if (!dobrado) {
            println("Dobre o tripe para guardá-lo.")
            return false
        }

        if (alturaMinima != alturaAtual) {
            println("Coloque o tripe em sua altura mínima para guardá-lo.")
            return false
        }

        return true
        println("O tripe está preparado para ser guardado.")
    }

    fun usar() {
        if (!prontoParaUsar()) {
            println("O tripe não está pronto para ser utilizado.")
            return
        }
        println("Utilizando o tripe...")
    }

    fun prontoParaUsar(): Boolean {
        if (dobrado) {
            println("Desdobre o tripe para utilizá-lo.")
            return false
        }

        val alturaMedia = (alturaMaxima / 2) + 1
        if (alturaAtual <= alturaMedia) {
            println("Coloque o tripe na altura mínima de ${alturaMedia}cm para utilizá-lo.")
            return false
        }

        return true
    }
}