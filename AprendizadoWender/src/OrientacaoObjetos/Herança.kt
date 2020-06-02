package OrientacaoObjetos

open class maquina(val marca: String) {

   open fun minhaMarca() {
        println("minha maarca é $marca")
    }
}

class computador(marca: String, val nucleos: Int) : maquina(marca) {

    override fun minhaMarca() {
        "sobreescrebi minha marca"
    }

    fun ligar() {}
    fun processar() {}

    fun overload(n : Int) = println()
    fun overload(n : String) = println()
}

fun main() {
     val c  = computador("razer",20)


    with(c){
        ligar()
        processar()
        minhaMarca()
        overload(10)
        overload("10")
    }


}