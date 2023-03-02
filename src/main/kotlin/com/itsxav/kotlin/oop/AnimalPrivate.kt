package com.itsxav.kotlin.oop

class AnimalPrivate(private var name: String,
                    private val weight: Double,
                    private val age: Int,
                    private val isMammal: Boolean) {

    fun getName(): String{
        return name
    }

    fun setName(newName:String){
        name = newName
    }
}

fun main() {
    val kucing = AnimalPrivate("kucing", 3.5, 4, true)

    println(kucing.getName())
    println(kucing.setName("cat"))
    println(kucing.getName())
}