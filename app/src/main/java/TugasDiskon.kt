import java.util.*

fun main() {
    val reader = Scanner(System.`in`)

    print("Masukkan Nominal Pembelanjaan: ")
    val bil1= reader.nextInt()
    diskonn(bil1)
}
fun diskonn(bil1:Int ) {
    val diskonn = bil1
    if (diskonn < 400000) {
        println("Total yang harus dibayar adalah $diskonn ")
    } else if ((diskonn >= 400000) && (diskonn <= 800000)) {
        val discount = diskonn * 4 / 1000
        val totalprice = diskonn - discount
        println("Total yang harus dibayar adalah $totalprice")
    } else if ((diskonn >= 800000) && (diskonn <= 1600000)) {
        val discount2 = diskonn * 9 / 100
        val totalprice2 = diskonn - discount2
        println("Total yang harus dibayar $totalprice2 ")
    } else if ((diskonn >= 1600000) && (diskonn <= 2000000)) {
        val dicount3 = diskonn * 19 / 100
        val totalprice3 = diskonn - dicount3
        println("Total yang harus dibayar adalah $totalprice3")
    } else if ((diskonn >= 2000000) && (diskonn <= 3000000)) {
        val discount4 = diskonn * 25 / 100
        val totalprice4 = diskonn - discount4
        println("Total yang harus dibayar adalah $totalprice4")
    } else {
        val discount5 = diskonn * 40 / 100
        val totalprice5 = diskonn - discount5
        println("Total yang harus dibayar adalah $totalprice5")
    }
}


