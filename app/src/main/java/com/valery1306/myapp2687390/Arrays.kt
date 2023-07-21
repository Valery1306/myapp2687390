package com.valery1306.myapp2687390

class Arrays {
}
fun main() {
    //val pets= arrayOf("dog", "cat", "canary")
    /*   print(pets.contentToString())
    print(pets[1])
    pets[2]="parrot"
    print(pets[2])

    for (element in pets){
        println("La mascota es $element")
    }

    for ((index,element) in pets.withIndex()){
        println("La mascota en la posicion $index es $element")
    }

    val instruments= mutableListOf("trumpet",  "piano", "violin")
    var instrumentss: List<String> = listOf("trumpet", "piano", "violin")

    print(instruments[1])
    instruments[1]="Guitar"*/

    //INVESTIGACIÓN
    //Como obtener el peimer y ultimo elemento de una lista
    val instruments= mutableListOf("trumpet",  "piano", "violin")
    val primer=instruments.first()
    println(primer)

    val ultimo=instruments.last()
    println(ultimo)

    //Como agregar elementos a una lista mutable
    instruments.add("Guitarelectric")
    println(instruments)
    //agregar otro eemento
    instruments.addAll(listOf("Tambor", "flauta"))
    println(instruments)

    //Como quitar elementos a una lista mutable
    //Eliminar elemento
    instruments.remove("Tambor")
    println("ELEMENTO ELIMINADO $instruments")
    //Eliminar elemntos por posicion
    instruments.removeAt(2)
    println("Elemento eliminado por posición $instruments")
    //Eliminar mas de un elemento
    instruments.removeAll(listOf("piano", "flauta"))
    print(instruments)

    //Como buscar elementos a una lista mutable
    val encontrado=instruments.find { it=="trumpet" }
    println(encontrado)

    //que pasa si quitas un elemento si no existe
    instruments.remove("Tambor")
    println("Elemento $instruments")

    //como quitar elementos de una lista a traves de un index
    instruments.removeAt(2)
    println("Elemento eliminado por posición $instruments")

    //como borrar la lista completa
    instruments.clear()
    print(instruments)
}
