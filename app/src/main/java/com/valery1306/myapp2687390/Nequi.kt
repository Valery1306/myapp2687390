package com.valery1306.myapp2687390

class Nequi {
}

fun main() {
    val saldodisponible:Int=4500
    do {  println("Bienvenid@ a Nequi")
        println("Ingrese su número de celular")
        val numero:Int= readLine()!!.toInt()

        println("Ingrese su clave !Recuerde que debe ser de 4 dígitos!")
        val clave:Int= readLine()!!.toInt()
        if (numero==30068876 && clave==1234){
            println("Bienenido a la plataforma")
            println("Tiene un saldo disponible de ${saldodisponible}")

        }else{
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más ")
        }

        println("Desea continuar 1.siguiente 2.terminar")
        val op1: Int = readLine()!!.toInt()

    } while (op1==1)


}