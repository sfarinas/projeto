package udemy2.composicao;

public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;

    public Item(int quantidade, double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
