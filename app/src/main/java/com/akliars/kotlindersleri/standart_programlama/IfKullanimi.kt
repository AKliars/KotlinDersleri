package com.akliars.kotlindersleri.standart_programlama

fun main() {
    val yas = 17
    val isim = "Mehmetx"

    if(yas >= 18){
        println("Reşitsiniz!")
    }else{
        println("Reşit değilsiniz")
    }

    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else if(isim == "Mehmet"){
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan Kişi")
    }

    val ka = "adminx"
    val s = 123456
    // AND Operatörü
    if (ka == "admin" && s == 123456){//&& = AND(ve) : true && true ise true , diğer durumlar false
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }

    val sayi= 30

    // OR (Veya) Operatörü
    if (sayi == 10 || sayi == 20){// || = Or(Veya) : false || false ise false , diğer durumlarda true
        println("Sayı 10 veya 20 dir")
    }else{
        println("Sayı 10 veya 20 değildir")
    }

    //When = Switch
    val sonuc = 50

    when (sonuc){
        10 -> println("Sonuç: 10")
        20 -> println("Sonuç: 20")
        30 -> println("Sonuç: 30")
        else -> println("Böyle bir sonuç yok")//else : default
    }
}