package com.akliars.kotlindersleri.nesne_tabanli_programlama.paket1

open class ClassA {
    var varSayilanDegisken = 1 // Hiç bir şey yazmazsak public'tir.
    public var publicDegisken = 2 // Her yerden erişebilirsin.
    private var privateDegisken = 3// Sınıftan erişebilirsin
    protected var protectedDegisken = 4// Kalıtım varsa erişebilirsin.

}