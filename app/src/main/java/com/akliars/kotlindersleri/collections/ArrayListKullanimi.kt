package com.akliars.kotlindersleri.collections

fun main() {
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //veri ekleme
    meyveler.add("Elma")//0.index
    meyveler.add("Muz")//1.index
    meyveler.add("Kiraz")//2.index

    println(meyveler)

    //güncelleme
    meyveler[1] = "Yeni Muz"

    println(meyveler)

    //insert(içerisine ekleme)
    meyveler.add(1,"Portakal")
    println(meyveler)

    //okuma işlemi
    println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")
    println("Boş kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor Mu : ${meyveler.contains("Elma")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for(meyve in meyveler){
        println("Sonuç : ${meyve}")
    }

    for((indeks,meyve) in meyveler.withIndex()){//Swift : enumarated()
        println("$indeks. ->  $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}