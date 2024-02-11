package com.akliars.kotlindersleri.nesne_tabanli_programlama

fun main(){
    println("------------------------------ II.Ödev -------------------------------------")
    val o2=Odev2()

    // 1. Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri döndüren bir metod
    var soru1Sonuc = o2.soru1(100.00)
    println("1.Soru örnek sonucu: $soru1Sonuc mil")

    // 2. Kenarları parametre olarak girilen be dikdörtgenin alanını hesaplayan bir metod
    val soru2Sonuc = o2.soru2(5,10)

    // 3. Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren metod
    val soru3Sonuc = o2.soru3(6)
    println("3.Soru örnek sonucu: $soru3Sonuc")

    // 4. Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu gösteren bir metod
    val soru4Sonuc = o2.soru4("deneme")

    // 5. Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod
    val soru5Sonuc = o2.soru5(3)
    println("5.Soru örnek sonucu: ${soru5Sonuc}")

    // 6. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    val soru6Sonuc = o2.soru6(25)
    println("6.Soru örnek sonucu: ${soru6Sonuc}₺ maaş")

    // 7. Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metod
    val soru7Sonuc = o2.soru7(4)
    println("7.Soru örnek sonucu: ${soru7Sonuc}₺ otopark ücreti")

    println("------------------------------------------------------------------------------")
    println("                  II.Ödev --- 11.02.2024 --- Ali Kars")
    println("------------------------------------------------------------------------------")
}