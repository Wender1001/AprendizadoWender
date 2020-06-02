package OrientacaoObjetos

enum class  Prioridade1{
    BAIXA,MEDIA, ALTA
}

enum class  Prioridade2(val id: Int){
    BAIXA(1),MEDIA(5), ALTA(10)
}

fun main() {

    for (p in Prioridade2.values()){
        println("$p - ${p.id} - ${p.ordinal} ")
    }

}
