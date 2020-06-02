package basic

fun campeonato(nomeTime: String, gols: Int = 0, nomeTecnico: String = "desconhecido") {
    println("o time do $nomeTime fez $gols gols, o nome do tecnico é $nomeTecnico ")
}

fun campeonato2(vararg valores: String) {

    if (valores.isNotEmpty()) {
        var soma = 0
        for (valor in valores) {
            println(valor)
        }
    }
}

fun <T> campeonato3(vararg valores: T) {

    for (valor in valores) {
        println(valor)
    }

}


fun main() {
    campeonato("corinthians", 35, "wender")
    campeonato("sao paulo", 20)
    campeonato(gols = 30, nomeTime = "santos")

    // VAR ARG, TRAZ UM NUMERO INDEFINIDO DE PARAMETROS DO MESMO TIPO
    campeonato2("wender", "augussto", "ramos")

    // PARAMETRO <T>, TRAZ QUALQUER TIPO DE VARIAVEL
    campeonato3("wender", 123, false, 'c', 0f, true)


    val str : String = "wender"
    str.capitalize()// transforma primeira letra em maisculo
    str.decapitalize()//transforma em minusculo
    str.startsWith("W", true)// verifica se começa com tal letra, mesmo se for maiuscula ou minuscula
    str.endsWith("w",true)// contrario do d cima
    arrayOf("1",2,true,0f,"a",'c')// lista de qualquer coisa


}







