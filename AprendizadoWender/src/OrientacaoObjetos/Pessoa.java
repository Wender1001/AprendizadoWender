package OrientacaoObjetos;

public class Pessoa {

    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        pessoa4 pessoa = new pessoa4(123);

        pessoa.getIdade();
        pessoa.setIdade(12);
    }
}
