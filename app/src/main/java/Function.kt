fun main() {
    val name = "Teya"
    evening(name)
    evening(name)
    evening(name)
    evening(name)
    evening(name)
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    Goodbye(name)
    Goodbye(name)
    night(name)
}

fun evening(name : String){
    println("Good Evening ${name}")

}
fun morning(name : String){
    println("Good Morning ${name}")
}

fun afternoon(name : String){
    println("Good Afternoon ${name}")
}

fun Goodbye(name : String){
    println("Goodbye ${name}")

}

fun night(name : String){
    println("Good night ${name}")
}