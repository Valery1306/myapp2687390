package com.valery1306.myapp2687390

class Reto3 {
}

fun main() {

    val autos = mutableListOf<String>()
    do {
        println("Bienvenid@")
        println("Elija que desea realizar 1.RegistrarA 2.MostrarA  3.BuscarA  4.ModificarA  5.EliminarA 6.BorrarLista")
        val op: Int = readLine()!!.toInt()
        if (op == 1) {
            println("Ingrese el auto")
            val auto: String = readLine()!!.toString()
            if (autos.contains("auto") == false) {
                autos.add(auto)
                println(autos)
            }
        } else {
            println("El auto ya fue registrado")
            println("Ingrese el auto")
        }
        println("Desea continuar 1.siguiente 2.terminar")
        val op1: Int = readLine()!!.toInt()
    } while (op1 == 1)
}



