package ondigitalinnovations.colletions

fun main() {
    val values = intArrayOf(2,3,12,5,6,1,10)

    for (valor in values){
        println(valor)
    }
    values.sort()
    values.forEach {
        println(it)
    }
}