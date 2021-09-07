fun main() {
// Tugas : Persegi, persegi panjang, jajar genjang, layang - layang, trapesium, lingkaran, segitiga, belah ketupat
    val bil1 = 3
    val bil2 = 5
    val radius = 18
    //Penjumlahan
    val result1 = bil1 + bil2
    //Pengurangan
    val result2 = bil2 - bil1
    //Perkalian
    val result3 = bil1 * bil2
    //Pembagian
    val result4 : Double  = bil2.toDouble() / bil1.toDouble()
    val luas_lingkaran : Double = 3.14 * (radius.toDouble() * radius.toDouble())
    println("Hasil operasi aritmatika antara bilangan 1 dan 2 " +
            "adalah sbb\nPenjumlahan $result1 \nPengurangan  $result2 \n" +
            "Perkalian $result3 \nPembagian $result4 \nLuas Lingkaran $luas_lingkaran" )
}



