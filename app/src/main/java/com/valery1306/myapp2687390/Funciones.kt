package com.valery1306.myapp2687390

class Funciones {


}
fun printHello(){
    println("Hello World")
}

fun calcuPerimetro(){
    println("Ingrese el radio de su circulo ")
    val radio: Int = readLine()!!.toInt()
    var pi:Double=3.1416
    println("el perimetro de su circulo es ${2*radio*(pi)} ")
}

fun calcuArea(){
    println("Ingrese el radio de su circulo ")
    val radio: Int = readLine()!!.toInt()
    var pi:Double=3.1416
    println("El Área de su circulo es ${radio*radio*(pi)}")
}

fun calcuTarea(b:Double, h:Double){
    println("El área de su Triangulo es ${(b*h)/2}")
}

fun calcuTperimetro(l1:Double,l2:Double, l3:Double){
    println("El Perimetro de su Triangulo es ${l1+l2+l3}")
}

fun tipoTriangulo(l1: Double,l2: Double,l3: Double){
    if (l1==l2 && l1==l3){
        println("Su trinagulo es Equilatero porque todos los lados son iguales")
    }
    else if (l1==l2 || l1==l2 || l2==l3){
        println("Su triangulo es Isoceles por que tiene dos lados iguales")
    }else{
        println("Su triangulo es Escaleno por que tiene todos los  lados diferentes")
    }
}

fun calcuCperimetro(b:Double, a:Double): Double {
    return (b+a)*2!!
}

fun calcuCarea(b:Double, a:Double): Double {
    return b*a!!
}

fun main() {
//fUNCION POR EXPRESIÓN
   /* val temperatura=20
    val isHot=if(temperatura>40)true else false
        println("Ingrese el su edad ")
    val edad: Int = readLine()!!.toInt()
    val isAd:String=if(edad>=18)"Bienvenido" else "Para la casa"

    print(isAd)
    printHello()
    do {
    println("Ingrese que desea realizar 1. Calcular Perimetro  2.Calcular Área")
    val op: Int = readLine()!!.toInt()
    if (op==1){
        calcuPerimetro()
    }else{
        calcuArea()
    }
   println("Desea continuar 1.siguiente 2.terminar")
    val op1: Int = readLine()!!.toInt()
}while (op1==1)
*/
    do {
        println("Ingrese que desea realizar 1. Calcular Perimetro Circulo 2.Calcular Área Circulo 3.Calcular Área Triangulo 4.Calcular Perimetro Triangulo  6.Perimetro Rectangulo 7.Área Rectangulo")
        val op: Int = readLine()!!.toInt()
        if (op==1){
            calcuPerimetro()
        }else if (op==2){
            calcuArea()
        }
        if (op==3){
            println("Ingrese la base")
            val b:Double= readLine()!!.toDouble()
            println("Ingrese la altura")
            val h:Double= readLine()!!.toDouble()
            calcuTarea(b,h)
        }else if(op==4){
            println("Ingrese lado1")
            val l1:Double= readLine()!!.toDouble()
            println("Ingrese lado2")
            val l2:Double= readLine()!!.toDouble()
            println("Ingrese lado2")
            val l3:Double= readLine()!!.toDouble()
            calcuTperimetro(l1,l2,l3)
            println("Su tipo de triangulo es ${tipoTriangulo(l1,l2,l3)}")
        }else if (op==6){
            println("Ingrese la base de su rectangulo")
            val b:Double= readLine()!!.toDouble()
            println("Ingrese la altura de su rectangulo")
            val a:Double= readLine()!!.toDouble()
            var per= calcuCperimetro(a,b)
            println("Su perimetro es ${calcuCperimetro(a,b)}")
        }else if (op==7){
            println("Ingrese la base de su rectangulo")
            val b:Double= readLine()!!.toDouble()
            println("Ingrese la altura de su rectangulo")
            val a:Double= readLine()!!.toDouble()
            var per= calcuCarea(a,b)
            println("Su Área es ${calcuCarea(a,b)}")
        }
        println("Desea continuar 1.siguiente 2.terminar")
        val op1: Int = readLine()!!.toInt()
    }while (op1==1)


}

