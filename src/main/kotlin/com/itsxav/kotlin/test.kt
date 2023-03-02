package com.itsxav.kotlin

const val APLIKASI = "Kotlin"
const val VERSI = "2022.3.2"
fun main() {
    println("Hello World")

    print("Hello ")
    println("World\n")

//>>>><<<<//
    //Integer Number (bilangan bulat)
    var age: Byte = 12
    var distance: Short = 12_345
    var height: Int = 123456789
    var balance: Long = 123_000_000L  //(Underscore in number

    println(age)
    println(distance)
    println(height)
    println(balance)

    print("\n")


    //Floating Point >> bilangan decimal (ada ,nya)
    var sample: Float = 77.77F
    var radius: Double = 12421.434223

    println(sample)
    println(radius)

    print("\n")

    //Convertion
    var ubahInteger: Int = sample.toInt()
    println(ubahInteger)

    print("\n")

//>>>>><<<<<//
    //Char Data Type (petik 1 > '')
    var huruf : Char = 'B'

    println(huruf)
    print("\n")

//>>>>><<<<<//
    //Data Boolean (True / False)
    val benar : Boolean = true
    var salah:  Boolean = false

    println(benar)
    println(salah)
    print("\n")

//>>>>><<<<<//
    //Variable var/val  > val tidak bisa diubah
    //Var - Mutable - Diubah
    //Val - Immutable - Tidak Diubah < direkomendasikan

    val nama = "Xav"
    val umur = 20

    var nama1 = "Franc"
    nama1 = "Xavier"

    println(nama)
    println(umur)
    println(nama1)
    print("\n")

//>>>><<<<//
    println("menggunakan aplikasi \n$APLIKASI: $VERSI")
}