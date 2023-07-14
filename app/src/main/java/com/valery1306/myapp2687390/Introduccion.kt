package com.valery1306.myapp2687390

class Introduccion {
}
fun main(){

    /*var lastName=readLine()

        /*Variables*/
        var name:String="Valery"
        val number1:Int=2
        val number2:Double=12.6
        val numf:Float=5.01f
        val chara:Char='o'
        var aleat:Boolean=true
        var large:Long=12335542
        var six:Short=12547
        println("Su nombre es $name y es de tipo String")
        print("Numero de tipo entero"+number1)
        print("Su numero float es"+numf)
    */
    print("Ingrese su nombre ")
    var name= readLine()
    print("Ingrese su Apellido ")
    var lastName= readLine()
    print("Ingrese su Edad ")
    var edad:Int= readLine()!!.toInt()

    println("En 10 años $name $lastName tendra ${edad+10}")

}
