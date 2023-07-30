package com.valery1306.myapp2687390

class Nequi {
}

fun main() {
    fun inicio():Boolean {
        var ingresar:Boolean=true
        var rep=1

        println("Bienvenid@")
        while (rep==1) {
            println("ingrese telefono ")
            var num = readln()!!.toInt()
            println("ingrese contraseña (4 digitos)")
            var con = readln()!!.toInt()

            if (num==30068876 && con==1234){
                println("entra")
                ingresar=true
                break
            }
            else {
                println("Sus datos son incorrectos, por favor vuelva a intentarlo")
                ingresar=false
            }
        }
        return ingresar
    }

    fun op1(plata:Int): Int {
        println("tu dinero actual es ${plata}")
        println("escriba el monto a retirar")
        var restplata = readln()!!.toInt()

        if (restplata > plata) {
            println("ups, no tienes tanto dinero")
        } else {
            return plata-restplata
            println(plata)
        }
        return plata
    }

    fun op2(plata: Int): Int {
        println("escribe el número de contacto que va a enviar el dinero")
        val numero = readLine()!!.toInt()
        println("tu monto actual es de ${plata} pesos")

        println("digita la cantidad a enviar")
        val sendmoney = readLine()!!.toInt()

        if (sendmoney > plata) {
            println("ups, no tienes tanto dinero")
        } else {
            println("dinero enviado")
            return plata - sendmoney
        }
        return plata
    }



    fun op3(plata: Int): Int{
        println("digita la cantidad a recargar")
        val sendmoney = readln()!!.toInt()
        println("esta seguro de recargar?? true/false")
        val op = readln()!!.toBoolean()
        if (op==false){
            println("proceso cancelado")
        }
        else{
            println("dinero recargado")
            return plata+sendmoney
        }
        return plata
    }




    fun main() {
        var entra = inicio()
        var plata = 4500
        var again = 1
        var contactos=arrayListOf("diego","adriana","laura","juan")



        if (entra == true) {
            while (again == 1) {
                println("Bienvenido a Nequi")
                println("su saldo disponible es de ${plata}")
                println("Opciones que desea realizar:")
                println("1. Saca plata")
                println("2. Envia plata")
                println("3. Recarga Plata")
                println("4  Salir del app")
                println("5. Consultar Saldo")
                println("6. ver tus contactos")
                var ele = readln()!!.toInt()

                if (ele==1){
                    plata=op1(plata)
                }
                else if (ele==2){
                    plata=op2(plata)

                }
                else if (ele==3){
                    plata=op3(plata)
                }
                else if (ele==4){
                    println("Salio del aplicativo, vuelva a ingresar")
                    break
                }
                else if (ele==5){
                    println("Saldo actual de ${plata}")
                }
                else if (ele==6){
                    println("contactos:")
                    println("----------")
                    println(contactos)

                }
                println("desea realizar otro proceso? 1.si  2.no")
                again = readln()!!.toInt()
            }
        }
    }


}