// primeira forma when

fun operacaoInteiros(a: Int, b: Int, str: String): Int {

    when (str) {

        "soma" -> return a + b

        "subtração" -> {
            return a - b
        }

        "multiplicação" -> {
            return a * b
        }

        "divisão" -> {
            return a / b
        }

        else -> {
            println("operação inválida")
            return 0
        }
    }

}

fun operacaoReais(c: Float, d: Float, str: String): Float {

    when (str) {

        "soma" -> return c + d

        "subtração" -> return c - d

        "multiplicação" -> return c * d

        "divisão" -> return c / d

        else -> {
            println("operação inválida")
            return 0f
        }
    }


}

//segunda forma when

fun  operacaoIdade( a : Int) : String{

    // range - intervalo de valores

    return when (a) {
        in 1 .. 99 -> "ta novo po"
        else -> "ja pode aposentar"
    }

}


fun main() {

    println("inteiros")
    println()
    println(operacaoInteiros(10,10,"soma"))
    println(operacaoInteiros(10,10,"subtração"))
    println(operacaoInteiros(10,10,"multiplicação"))
    println(operacaoInteiros(10,10,"divisão"))
    println()

    println("reais")
    println()
    println(operacaoReais(10.5f,10.5f,"soma"))
    println(operacaoReais(10.5f,10.5f,"subtração"))
    println(operacaoReais(10.5f,10.5f,"multiplicação"))
    println(operacaoReais(10.5f,10.5f,"divisão"))

    println("idade")

    println(operacaoIdade(99))
    println(operacaoIdade(100))



}