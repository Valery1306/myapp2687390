package com.valery1306.myapp2687390

class Reto3 {
}

fun main() {

    var op: Int=1
    val autos= mutableListOf("twingo","chevrolet","ford")

    println("Bienvenid@")
    while (op==1) {
        println("1. RegistrarAutos")
        println("2. Mostrarlista")
        println("3. BuscarAutos")
        println("4. ModificarAutos")
        println("5. EliminarAutos")
        println("6. EliminarAutos")

        print("Ingrese que proceso desea realizar: ")
        var op1 = readln()!!.toInt()

        if (op1 == 1) {
            println("Ingrese el nombre del Auto")
            var newcar = readLine()

            if(autos.contains(newcar)==false){
                autos.add(newcar.toString())
                println(autos)}
            else if(autos.contains(newcar)==true) {
                println("el auto ya existe, vuelva a ingresar un auto nuevo")
            }


        } else if (op1 == 2) {
            for ((index, element) in autos.withIndex())
                println("Auto número ${index} es ${element}")


        } else if (op1 ==3 ) {
            println("Ingrese el nombre del Auto que desea buscar")
            var searchcar = readLine()
            var veri = println("${autos.contains(searchcar.toString())}")


        } else if (op1 ==4 ) {
            for ((index, element) in autos.withIndex()){
                println("Auto numero ${index} es ${element}")}

            println("Ingrese el número del auto que deseas modificar")
            var eleccmodify = readln()!!.toInt()

            println("Ingresa el nuevo nombre")
            var eleccmodify2 = readln()!!.toString()

            autos[eleccmodify]=eleccmodify2

            println(autos)

        } else if (op1 == 5) {
            for ((index, element) in autos.withIndex()){
                println("Auto numero ${index} es ${element}")}

            println("ingrese el número del Auto que deseas eliminar")
            var eleceliminar = readln()!!.toInt()
            autos.removeAt(eleceliminar)

            for ((index, element) in autos.withIndex()){
                println("Auto número ${index} es ${element}")}

        } else if (op1 == 6) {
            println("Se eliminara toda la lista de Autos, desea continuar?")
            println("1. si 2. no")
            var eliminarlist = readln()!!.toInt()
            if (eliminarlist== 1) { autos.clear() }
        }

        println("desea hacer otro proceso? 1 si 2 no")
        op = readLine()!!.toInt()
    }
}



