package com.akliars.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val topkapiSaray = Saray(5,100)
    val bogazVilla = Villa(true,50)

    println(topkapiSaray.kuleSayisi)
    println(topkapiSaray.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)
}