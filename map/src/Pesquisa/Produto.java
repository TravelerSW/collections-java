package Pesquisa;

public class Produto {
    //Atributo
    private String nome;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    private double preco;
    
    public double getPreco() {
        return preco;
    }

    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    
}
