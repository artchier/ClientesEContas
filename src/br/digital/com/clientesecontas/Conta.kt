package br.digital.com.clientesecontas

class Conta(var numConta: Int,
            var saldo: Double,
            titular: Cliente
){
    fun deposito(qtde: Double){
        saldo += qtde
        println("Depósito realizado. \tSaldo atual: $saldo")
    }

    fun saque(qtde: Double){
        if(qtde > saldo)
            println("Saldo insuficiente")
        else {
            saldo -= qtde
            println("Saque realizado. \tSaldo atual: $saldo")
        }
    }
}