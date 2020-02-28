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

    val a = 10
    val b = 20
    val c = 30



    fun calculaBonus(a : Int, b : Int, c : Int)  {

        println("o bonus é ${ a + b  * c * 2}")

    }

    calculaBonus( a, b, c )

    fun hello(nome :String) : String {

        return "Ola, $nome"

    }

    fun hello2(nome :String) : String  = "Ola, $nome"

    fun soma ( a: Int, b: Int) = a + b

    println(hello2("wender"))

    println(hello("wender"))


    println(soma(2,2 ))
}



