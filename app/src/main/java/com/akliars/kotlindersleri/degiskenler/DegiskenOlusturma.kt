package com.akliars.kotlindersleri.degiskenler

fun main() {

  //  println("Merhaba Dünya!   xxx")

    //Değişken oluşturma

    var ogrenciAdi = "Ali"
    var ogrenciYas:Int = 27
    var ogrenciBoy = 1.75
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyorMu = true
/*
    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)
    */
    println("Öğrenci Adı                    : $ogrenciAdi") // Swift : \(ogrenciAdi) = $ogrenciAdi
    println("Öğrenci Yaşı                   : $ogrenciYas")
    println("Öğrenci Boy                    : $ogrenciBoy cm")
    println("Öğrenci Baş Harf               : $ogrenciBasharf")
    println("Öğrenci Devam Ediyor mu        : $ogrenciDevamEdiyorMu")

    var a = 10
    var b = 20

    println("$a x $b : ${ a * b }")

    //Sabitler
    //Swift : let,Java,Dart : final
    //Dart const görsel nesne (Buton,Textview gibi yapılarda kullanılır)
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 90
    println(numara)
    //numara =200

    //Tür Dönüşümü
    //1. Sayısaldan Sayısala Dönüşüm
    val i = 41
    val d = 87.92

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()


    println(sonuc1)
    println(sonuc2)

    //2. Sayısaldan Metine Dönüşüm

    val sonuc3 = i.toString()//"41"
    val sonuc4 = d.toString()//"87.93"

    println(sonuc3)
    println(sonuc4)


    //3. Metinden sayısala dönüşüm
    val yazi = "47"
    val sonuc5 = yazi.toIntOrNull()
    //Dönüşümde sorun yoksa çalışır, eğer varsa null üretir.
    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşüm Hatası")
    }

    //Alternatif yöntem
    sonuc5?.let {//if (sonuc5 != null)}
        println(it)
    }
}