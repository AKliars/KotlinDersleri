package com.akliars.kotlindersleri.nesne_tabanli_programlama.Composition

data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_yil:Int,
                   var kategori:Kategoriler,
                   var yonetmen:Yonetmenler) {
}