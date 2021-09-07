fun main(){
    persegi(10.0 ,)
    persegiPanjang(8.0 , 4.0)
    jajarGenjang(8.0, 9.0)
    layanglayang(8.0,18.0)
    trapesium(9.0,18.0,10.0)
    lingkaran(28.0)
    segitiga(8.0,16.0)
    belahKetupat(16.0,20.0)


}

fun belahKetupat(diagonal1: Double,diagonal2 : Double) {
    val belahKetupat= 1/2 * diagonal1 *diagonal2
    println("Luas Belah Ketupat adalah $belahKetupat")

}

fun segitiga(alaz : Double, tingghi:Double) {
    val segitiga= 1/2 * alaz * tingghi
    println("Luas segitiga adalah $segitiga")

}

fun lingkaran(rusuk:Double) {
    val lingkaran= 22/7 * rusuk * rusuk
    println("Luas lingkaran adalah $lingkaran")

}

fun trapesium(alasa: Double,alasb : Double,tinggi:Double) {
    val luastrapesium= 1/2 * (alasb+alasa) * tinggi
    println("Luas trapesium adalah $luastrapesium")

}

fun layanglayang(d1 : Double,d2 : Double) {
    val layanglayang= 1/2 * d1 * d2
    println("Luas Layang-layang adalah $layanglayang")
}

fun persegi(sisi : Double){
    val luasPersegi = sisi*sisi
    println("Jadi Luas Persegi Adalah $luasPersegi")
}
fun persegiPanjang(panjang : Double ,lebar : Double){
    val luaspersegipanjang= panjang * lebar
    println("Luas Persegi panjang adalah $luaspersegipanjang")
}
fun jajarGenjang( alas : Double , tinggi : Double){
    val alasxtinggi= alas*tinggi
    println("Luas Jajargenjang adalah $alasxtinggi")
}

