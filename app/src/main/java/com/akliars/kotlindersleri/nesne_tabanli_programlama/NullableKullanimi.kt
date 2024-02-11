package com.akliars.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nullable - Null Safety - Optional(Swift)
    //Tanımlama
    var mesaj:String? = null

    mesaj = "Merhaba"

    //Yöntem 1
    println("Yöntem 1 : ${mesaj?.uppercase()}")

    //Yöntem 2
   // println("Yöntem 2 : ${mesaj!!.uppercase()}")

    //Yöntem 3
    if(mesaj != null){
        println("Yöntem 3 : ${mesaj.uppercase()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4
    mesaj?.let {
        println("Yöntem 4 : ${mesaj.uppercase()}")
        println("Yöntem 4 : ${it.uppercase()}")

    }
}