package com.valery1306.myapp2687390

class Condicionales {
}
fun main(){
    /* print("Ingrese un numero ")
     var num1:Int= readLine()!!.toInt()
     print("Ingrese un numero ")
     var num2:Int= readLine()!!.toInt()

     if (num1>num2){
         println("El primer numero es el mayor  $num1")
     }else if (num1==num2){
         println("Los dos numero son iguales")
     }
     else{
         println("El segundo numero es el mayor  $num2")

     }
     var aleatorio=(1..20)


        print("Ingrese un numero del 1 al 20 ")
     var num:Int= readLine()!!.toInt()
     if (num in 1..20){
         print("El numero esta en el rango")
     }
     else{
         print("Te dije un numero del 1 al 20")
     }
     */

    var aleatorio=(1..50).random()
    when(aleatorio){
        0 -> println("No hay concidencias $aleatorio")
        in 1..10 -> println("Hay 10 concidencias $aleatorio")
        in 20..50 -> println("Hay muchas coincidencias $aleatorio")
    }


}