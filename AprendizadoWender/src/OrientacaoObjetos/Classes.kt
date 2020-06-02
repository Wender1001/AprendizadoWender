package OrientacaoObjetos
//
//import java.util.Objects.toString
//
//class pessoa2(var nome: String, val anoNascimento: Int)
//
//class pessoa3(var nome: String) {
//
//    var ano: Int? = null
//
//    constructor (nome: String, ano: Int) : this(nome) {
//        this.ano = ano
//    }
//
//    fun saudacao() {
//        println("Olá, meu nome é $nome e nasci em $ano")
//    }
//}
//
//
//fun main() {
//
//    val pessoa = pessoa3("wender", 2001)
//    val pessoa2 = Pessoa1("wender", 2001)
//
//    val p1 = pessoa3("wender")
//    val p2 = pessoa3("wender", 2001)
//
//    println(pessoa.nome)
//    println("${p2.ano}  e ${p2.nome}")
//    p2.saudacao()
//    p1.saudacao()
//    pessoa.saudacao()
//    println(toString(pessoa2))
//    println(pessoa2.nome)
//    pessoa2.saudacao2()
//
//}

class pessoa4(var idade: Int)

//fun main() {
//
//    val p = Pessoa()
//
//    // get set por baixo dos panos
//    p.nome
//    p.nome = "wneder"
//
//
//
//}

// get set personalizado
class Maquina(marca: String) {

    var nucleos = 0
        get() {
            println("get foi chamado")
            return field
        }
        set(value) {
            println("set foi chamado")
            field = value
        }

    fun ligar(){}
    fun processar(){}
    fun desligar(){}

}

fun main() {

    var m = Maquina("razer")

    with(m) {
        ligar()
        processar()
        desligar()
    }
    println(m.nucleos)
    m.nucleos = 10

}