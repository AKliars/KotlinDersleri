package com.akliars.kotlindersleri.collections

fun main() {
    val iller = HashMap<Int,String>()
    //Ekleme
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller[6] = "Ankara"

    println(iller)
    println(iller.get(16))
    //Güncelleme
    iller.put(16,"Yeni Bursa")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }
    //Temizleme
    iller.clear()
    println(iller)

}