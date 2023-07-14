package com.valery1306.myapp2687390

class Ciclos {
}
fun main() {

    /*    for (i in 1..10) {
        if ((i%2) !=0) {
            println("Su numero es impar  $i" )
        }else{
            println("Su numero es par  $i")
        }

    }
     var cont = 0
    var impares = 0
    var cont2 = 0
    var pares = 0
    var suma = 0
    var suma1 = 0
    for (numero in 1..5) {
        println("Ingrese el numero ")
        var numero: Int = readLine()!!.toInt()
        if (numero <= 0) {
            break
        } else {
            if ((numero % 2) != 0) {
                println("Su numero es impar $numero")
                cont = cont + 1
                impares = cont
                suma = suma + numero

            } else {
                println("Su numero es par $numero")
                cont2 = cont2 + 1
                pares = cont2
                suma1 = suma1 + numero

            }

        }

    }
    println("Tiene $pares numeros pares")
    println("Tiene $impares numeros impares")
    println("La suma de los numeros impares es $suma")
    println("La suma de los numeros pares es $suma1")
}

 var cont = 0
    var impares = 0
    var cont2 = 0
    var pares = 0
    var suma = 0
    var suma1 = 0
    var inicio=1

    while (inicio==1){
        println("Ingrese el numero ")
        var numero: Int = readLine()!!.toInt()
        if (numero <= 0) {
            break
        } else {
            if ((numero % 2) != 0) {
                println("Su numero es impar $numero")
                cont = cont + 1
                impares = cont
                suma = suma + numero

            } else {
                println("Su numero es par $numero")
                cont2 = cont2 + 1
                pares = cont2
                suma1 = suma1 + numero

            }

        }
    println("Desea ingresar otro numero? 1.si  2.no gracias")
        inicio= readLine()!!.toInt()
    }
    println("Tiene $pares numeros pares")
    println("Tiene $impares numeros impares")
    println("La suma de los numeros impares es $suma")
    println("La suma de los numeros pares es $suma1")


    */

    var cont = 0
    var impares = 0
    var cont2 = 0
    var pares = 0
    var suma = 0
    var suma1 = 0
    var inicio=1
    var numero=0

    do {
        println("Ingrese el numero ")
        var numero: Int = readLine()!!.toInt()
    } while (inicio==1)
        if (numero <= 0) {
            //break
        } else {
            if ((numero % 2) != 0) {
                println("Su numero es impar $numero")
                cont = cont + 1
                impares = cont
                suma = suma + numero

            } else {
                println("Su numero es par $numero")
                cont2 = cont2 + 1
                pares = cont2
                suma1 = suma1 + numero

            }

        }
        println("Desea ingresar otro numero? 1.si  2.no gracias")
        inicio= readLine()!!.toInt()

    println("Tiene $pares numeros pares")
    println("Tiene $impares numeros impares")
    println("La suma de los numeros impares es $suma")
    println("La suma de los numeros paress es $suma1")


}




