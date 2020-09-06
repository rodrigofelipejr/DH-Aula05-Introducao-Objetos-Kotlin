package br.com.digital.kotlin.exercicio1

class Exercicio1 {
   fun main(){
      val cliente1: Cliente = Cliente("João", "Silva")
      val conta1: Conta = Conta(111, cliente1)

      val cliente2 : Cliente = Cliente("Felipe", "Silva")
      val conta2: Conta = Conta(222, cliente2)

      conta1.depositar(1000.0)
      conta1.saque(600.0)
      conta1.saque(600.0)

      println()

      conta2.depositar(2000.0)
      conta2.saque(600.0)
      conta2.saque(600.0)

   }
}