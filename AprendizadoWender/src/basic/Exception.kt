package basic

import kotlin.random.Random

fun main() {


    try {
        println("19".toInt())
    } catch (e: Exception) {
        println("ops isso nao e um numero")
    } finally {
        println("teste de numero " + Random.nextInt() + " finalizado")
    }

// exemplo : conexão com o banco

    // null safe ->


    //trata o erro
    val str : String? = null
    println(str?.length)

    // da erro
    println(str!!.length)

}