package udemy.classes.replayClasses;

public class Produto {
    String nome;
    double valor;
    double desconto;

    // CONTRUTOR PADRAO
    Produto(){
    }
    // CONTRUTOR IMPLISSITO
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        valor = precoInicial;
        desconto = descontoInicial;
    }



    double precoComDesconto(){
        return valor * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return valor * (1 - desconto + descontoDoGerente);
    }
}
