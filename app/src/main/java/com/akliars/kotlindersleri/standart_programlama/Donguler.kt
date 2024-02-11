package com.akliars.kotlindersleri.standart_programlama

fun main() {
    //1,2,3
    //for each
    //Swift 1...3
    println("-----------------------------------------")
    println(">>>>>>>>>>>>>>Döngüler<<<<<<<<<<<<<<<<<<<")
    println("-----------------------------------------")
    for(i in 1..3){//i = array indeksi (index)
        println("Döngü 1 : $i")
    }
    println("-----------------------------------------")
    //10 ile 20 arasında 5 er artsın
    for (a in 10..20 step 5){
        println("Döngü 2 : $a")
    }
    println("-----------------------------------------")
    //20 ile 10 arasında 5 er azalsın
    for (b in 20 downTo 10 step 5){
        println("Döngü 3 : $b")
    }

    //1,2,3
    var sayac = 1
    println("-----------------------------------------")
    while (sayac < 4){
        println("Döngü 4 : $sayac")
        sayac++ // sayac = sayac + 1 // sayac +=1

    }
    println("-----------------------------------------")
    for(i in 1..5){
        if (i==3){
            break // Tamamen döngüyü durdurur
        }
        println("Döngü 5 : $i")
    }
    println("-----------------------------------------")
    for(i in 1..5){
        if (i==3){
            continue // Burayı es geçer, devam eder
        }
        println("Döngü 6 : $i")
    }
}