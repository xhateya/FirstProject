import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Masukkan Bilangan Pertama : ")
    val bil1= reader.nextInt()


    print("Masukkan Bilangan Kedua : ")
    val bil2= reader.nextInt()
    calculator2Bil(bil1,bil2)
}

fun calculator2Bil(bil1: Int, bil2: Int) {
    val penjumlahan = bil1 + bil2
    val perkalian = bil1 * bil2
    val pengurangan = bil2 - bil1
    val pembagian = bil2.toDouble() / bil1.toDouble()
    print("\n")

    println("Operasi matematika antar $bil1 dan $bil2 sebagai berikut \n" +
            "Penjumlahan $penjumlahan\nPerkalian $perkalian \n" +
            "Pengurangan $pengurangan \nPembagian $pembagian")
}


