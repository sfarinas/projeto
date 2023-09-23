package udemy.classes.replayClasses;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.valor = 1434.98;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "caneta";
        p2.valor = 5.76;
        p2.desconto = 0.15;

        System.out.println(p1.nome);
        System.out.println(p1.valor);
        double valorFinal = p1.valor * (1 - p1.desconto);
        System.out.println(valorFinal);

        if (p1.valor < 1300.90){
            System.out.println("Esta mais barato que R$ 1300");
        }else {
            System.out.println("Está mais caro que R$ 1300");
        }

    }
}
