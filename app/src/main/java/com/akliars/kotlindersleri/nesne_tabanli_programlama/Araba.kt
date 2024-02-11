package com.akliars.kotlindersleri.nesne_tabanli_programlama

data class Araba(var renk:String,var hiz:Int,var calisiyorMu:Boolean) {

    init {
        //Sınıftan nesne oluştuğunda çalışır
        println("******* Nesne oluştu ********")
    }

    fun calistir(){//Side effect(Yan etki)
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz += kacKm// hiz = hiz + kacKm

    }

    fun yavasla(kacKm: Int){
        hiz -= kacKm // hiz = hiz - kacKm
    }

    fun bilgiAl(){
        println("-----------------------")
        println("Renk : ${renk}")
        println("Hız : ${hiz}")
        println("Çalışıyor Mu? : ${calisiyorMu}")
    }
}