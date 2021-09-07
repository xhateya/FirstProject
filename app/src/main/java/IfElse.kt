import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    println("Masukkan Bilangan :")
    val number = reader.nextInt()

    if (number < 0){
        print("Negative")
    }else{
        print("Positive")
    }
}
