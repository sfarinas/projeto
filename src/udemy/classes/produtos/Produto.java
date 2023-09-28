package udemy.classes.produtos;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComdesconto(){
        return preco * (1 - desconto);
    }
}
