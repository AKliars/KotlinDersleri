package com.akliars.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne Tanımlama
    val bmw = Araba("Kırmızı",0, false)
    //Okuma İşlemi
    bmw.bilgiAl()


    //Veri Atama
    bmw.hiz = 10
    bmw.calisiyorMu = true
    // Bu kod tekrarının önüne fonksiyon yazarak geçildi.
    /*
    println("-----------------------")
    println("Renk : ${bmw.renk}")
    println("Hız : ${bmw.hiz}")
    println("Çalışıyor Mu? : ${bmw.calisiyorMu}")
    */

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(30)
    bmw.bilgiAl()
    bmw.yavasla(10)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz",100,true)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(50)
    sahin.bilgiAl()
    sahin.yavasla(40)
    sahin.bilgiAl()

}