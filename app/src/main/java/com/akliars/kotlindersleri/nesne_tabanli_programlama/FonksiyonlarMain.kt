package com.akliars.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()
   // println(f.selamla2())
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    f.selamla3("Zeynep")

    f.carp(30,40,"Zeynep")

   // val sonuc = 5.carpi(2)
    val sonuc = 5 carpi 2
    println("Çarpma sonucu : $sonuc")

}

infix fun Int.carpi(sayi:Int) : Int {
    return this * sayi
    //this : bulunduğu sınıfı temsil eder.(Int)
    //Swift this = self
}

