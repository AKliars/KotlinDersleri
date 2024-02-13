package com.akliars.kotlindersleri.collections

fun main() {
    val u1 = Urunler(1,"Televizyon",12000)
    val u2 = Urunler(2,"Atkı",500)
    val u3 = Urunler(3,"Vazo",2000)

    val urunlerListesi = ArrayList<Urunler>()
    urunlerListesi.add(u1)
    urunlerListesi.add(u2)
    urunlerListesi.add(u3)

    for (u in urunlerListesi){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    //Sorting - Sıralama
    println("------------- Fiyat : Artan  ----------------")
    val s1 = urunlerListesi.sortedWith(compareBy { it.fiyat })//DESC : descending
    for (u in s1){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }
    println("------------- Fiyat : Azalan  ----------------")
    val s2 = urunlerListesi.sortedWith(compareByDescending { it.fiyat })//ASC : ascending
    for (u in s2){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }
    println("------------- Ad : Artan  ----------------")
    val s3 = urunlerListesi.sortedWith(compareBy{ it.ad })//DESC : descending
    for (u in s3){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }
    println("------------- Ad : Azalan  ----------------")
    val s4 = urunlerListesi.sortedWith(compareByDescending { it.ad })//ASC : ascending
    for (u in s4){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }

    //Filtreleme
    println("------------- Filtreleme 1 ----------------")
    val f1 = urunlerListesi.filter { it.fiyat > 1000 && it.fiyat < 10000 }
    for (u in f1){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }
    println("------------- Filtreleme 2 ----------------")
    val f2 = urunlerListesi.filter { it.ad.contains("zo") }
    for (u in f2){
        println("Id : ${u.id} - Ad : ${u.ad} - Fiyat : ${u.fiyat} ₺")
    }


}