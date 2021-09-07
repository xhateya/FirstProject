import java.util.*
//Soal renungan
/* Ibu beli belajaan di supermarket
400.000 -> diskon 4 %
800.000 -> diskon 9 %
1.600.000 -> diskon 19 %
2.000.000 -> diskon 25 %
3.000.000 -> diskon 40 %
total uang yang harus dibayar
* bit.ly/edit-cat */

fun main(){
    val belanja = 500000
    if (belanja < 400000){
        println("Total yang harus dibayar adalah $belanja ")
    }else if ((belanja >= 400000) && (belanja < 800000)){
        val discount = belanja * 4/100
        val totalprice = belanja - discount
        println("Total yang harus dibayar adalah $totalprice")
    }else if ((belanja >= 800000) && ( belanja <1600000)){
        val discount2  = belanja * 9/100
        val totalprice2= belanja - discount2
        println("Total yang harus dibayar $totalprice2 ")
    }else if ((belanja >= 1600000) && (belanja <2000000)){
        val dicount3= belanja * 19/100
        val totalprice3= belanja -dicount3
        println("Total yang harus dibayar adalah $totalprice3")
    }else if (( belanja >= 2000000)&& (belanja < 3000000)){
        val discount4 = belanja * 25/100
        val totalprice4 = belanja -discount4
        println("Total yang harus dibayar adalah $totalprice4")
    }else{
        val discount5 = belanja * 40/100
        val totalprice5 = belanja - discount5
        println("Total yang harus dibayar adalah $totalprice5")
    }

}