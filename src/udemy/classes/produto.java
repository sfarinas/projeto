package udemy.classes;

public class produto {
    String nome;
    double preco;
    double desconto;

    produto (String nomeInicial){
        nome = nomeInicial;
    }
    produto(){

    }


    double precoComDesconto(){

        return preco * (1 - desconto);
    }

}

