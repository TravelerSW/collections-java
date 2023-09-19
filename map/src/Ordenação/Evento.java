package Ordenação;

public class Evento {
    //atributos

    private String nome;

    public String getNome() {
        return nome;
    }

    private String atracao;

    public String getAtracao() {
        return atracao;
    }

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", atração: " + atracao;
    }

    

    
}
