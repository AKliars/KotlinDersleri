package com.akliars.kotlindersleri.nesne_tabanli_programlama

class Odev2 {

    //  Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri döndüren bir metod
    fun soru1(km: Double) : Double {
        return km * 0.621
    }

    // Kenarları parametre olarak girilen be dikdörtgenin alanını hesaplayan bir metod
    fun soru2(a:Int,b:Int){
        println("2.Soru örnek sonucu: ${a * b}" )
    }

    //  Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren metod
    fun soru3(a: Int) : Int{
       var sayi = a
        var sonuc= 1
        while (sayi>1){
            sonuc *= sayi
            sayi--
       }
        return sonuc
    }

    // Kelime içerisinde kaç adet e harfi olduğunu söyleyen metod
    fun soru4(kelime:String){
        var sayac = 0

        for (e in kelime){
            if(e == 'e'){
                sayac++
            }
        }
        println("4.Soru örnek sonucu: $kelime kelimesi içerisinde $sayac adet e harfi vardır. ")
    }

    // Girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod
    fun soru5(kenarSayisi:Int) : Int {
        return  ((kenarSayisi - 2) * 180)
    }

    // Gün sayısına göre maaş hesaplayan metod
    fun soru6(gunSayisi:Int) : Int{
        var calisilanSaat = gunSayisi * 8
        var maas = 0;
        if (calisilanSaat > 150 ){
            var mesaiUcreti = (calisilanSaat - 150) * 80
            maas = (150 * 40) + mesaiUcreti
        }else {
            maas = calisilanSaat * 40
        }
        return  maas
    }

    // Parametre olarak girilen otoparak süresine göre ücret hesaplayan metod
    fun soru7(otoparkSuresi:Int) : Int{
        var otoparkUcreti = 0
        if (otoparkSuresi == 1){
            otoparkUcreti = 50
        }else if ( otoparkSuresi >1 ){
            otoparkUcreti = 50
            for (i in otoparkSuresi downTo 2){
                otoparkUcreti +=10
            }
        }

        return otoparkUcreti
    }


}