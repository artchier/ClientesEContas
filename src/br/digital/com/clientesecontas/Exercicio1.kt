package br.digital.com.clientesecontas

fun main(){
        val cliente1 = Cliente("João", "da Silva")
        val cliente2 = Cliente("Maria", "da Silva")

        val conta1 = Conta(1, 1000.00, cliente1)
        val conta2 = Conta(2, 2000.00, cliente2)

        conta1.saque(500.00)
        conta2.saque(500.00)
        conta1.deposito(1000.00)
        conta2.deposito(1000.00)
 }
