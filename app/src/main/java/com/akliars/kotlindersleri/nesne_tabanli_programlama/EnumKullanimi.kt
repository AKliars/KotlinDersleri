package com.akliars.kotlindersleri.nesne_tabanli_programlama

fun main() {
    ucretHesapla(75,KonserveBoyut.ORTA )
}

fun ucretHesapla(adet:Int,boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet : ${adet * 5.6} ₺")
        KonserveBoyut.ORTA -> println("Toplam Maliyet : ${adet * 7.8} ₺")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet : ${adet * 9.4} ₺")

    }
}