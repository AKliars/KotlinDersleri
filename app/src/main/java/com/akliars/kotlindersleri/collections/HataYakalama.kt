package com.akliars.kotlindersleri.collections

import java.lang.Exception

fun main() {
    //1.Compile Error
    val a = 5
    //a = 4

    //2.Exception (Runtime Error)
    val x = 10
    val y = 5

    try {
        println("Sonuç : ${x/y}")
        println("İşlem Tamam")
    }catch (e:Exception){
        println("Sayı 0'a bölünemez")
    }

}