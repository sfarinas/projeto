package udemy.classes.replayClasses;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        // PADRAO DO COSTRUTOR IMPLISSITO
        Produto p1 = new Produto("NOTEBOOK", 1434.98, 0.25);

        // PADRAO DO COSTRUTOR PADRAO
        Produto p2 = new Produto();
        p2.nome = "caneta";
        p2.valor = 5.76;
        p2.desconto = 0.15;

        System.out.println(p1.nome + ", " + p1.valor + ", " + p1.desconto);
        System.out.println(p2.nome + ", " + p2.valor + ", " + p2.desconto);
        double valorFinal = p1.valor * (1 - p1.desconto);

    // FORMULA PARA FORMATAR O NUMERO.
        DecimalFormat formato = new DecimalFormat("#.##");
        String numeroFormatado = formato.format(valorFinal);

        System.out.println(numeroFormatado);

        if (p1.valor < 1300.90){
            System.out.println("Esta mais barato que R$ 1300");
        }else {
            System.out.println("Está mais caro que R$ 1300");
        }

        System.out.println(p1.nome + " Preco R$ " + p1.valor);
        System.out.println(p2.nome + " Preco R$ " + p2.valor);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        System.out.printf("Seu desconto é R$ %.2f\n", precoFinal1);
        System.out.printf("Seu desconto é R$ %.2f ", precoFinal2, "\n");

    }
}
