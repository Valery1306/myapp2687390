package com.valery1306.myapp2687390

class Reto1 {
}
fun main(){
    var dado1=(1..6).random()
    var dado2=(1..6).random()

    if (dado1==1 || dado2==1){
        println("Ganaste, has obtenido un par de unos en los dados $dado1 $dado2")
    }else if (dado1+dado2==3){
        println("Ganaste, has obtenido un total de tres en los dados $dado1 $dado2")

    }else if (dado1+dado2==11) {
        println("Ganaste, has obtenido un total de Once en los dados $dado1 $dado2")
    }
    else if (dado1+dado2==12) {
        println("Ganaste, has obtenido un total de Doce en los dados $dado1 $dado2")
    }
    else if (dado1+dado2==7) {
        println("Ganaste, has obtenido un total de Siete en los dados $dado1 $dado2")
    }
    else{
        print("Has perdido vuelve a intentarlo")
    }
}