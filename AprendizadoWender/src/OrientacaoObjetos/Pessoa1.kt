package OrientacaoObjetos

class Pessoa1(var nome: String, var anoNascimento: Int) {

    fun saudacao2(){
        println("o nome da pessoa é $nome e a data de nascimento é $anoNascimento")
    }
    override fun toString() = "$nome e $anoNascimento"


}