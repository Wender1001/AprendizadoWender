package basic

fun main() {
    println("Ola")

    var nome = "wender"
    var idade = 13
    var boolean = false

    //////////////////////
    //concatenar bonito

    val frase = "kotlin obvius"
    println("a frase é ${frase.length}")

    val str = """ lalallallala
         alalallalalla
         lalallallala
         lalalla

         """.trimMargin()

    println(str)
    /////////////
    // funçoes
    // if else
    val a = 10
    val b = 20
    val c = 30


    fun calculaBonus(cargo: String, salario: Float): Float {

        // println("o bonus é ${a + b * c * 2}")


        return if (cargo == "Coordenador") {
            salario * 0.2f

        } else if (cargo == "Gerente Junior") {
            salario * 0.5f

        } else {
            salario * 2f
        }
    }


    // calculaBonus(a, b, c)

    fun hello(nome: String): String {

        return "Ola, $nome"

    }

    fun hello2(nome: String): String = "Ola, $nome"

    fun soma(a: Int, b: Int) = a + b

    println(hello2("wender"))

    println(hello("wender"))


    println(soma(2, 2))

    // ternario
    val valor = 10

    val strng = if (valor == 10) "Sim" else "Não"

    println(strng)

    //   operador ELVIS "?:" PRESLEY ?

    val tests: Int? = null

    val opTest: Int = tests ?: 100

    println(opTest)


    fun calculaBonus2(cargo: String, salario: Float): Float {

        // println("o bonus é ${a + b * c * 2}")


        return if (cargo == "Coordenador") {
            salario * 0.2f

        } else if (cargo == "Gerente Junior") {
            salario * 0.5f

        } else {
            salario * 2f
        }
    }
}