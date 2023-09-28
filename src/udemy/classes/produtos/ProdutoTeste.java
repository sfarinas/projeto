package udemy.classes.produtos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto();
        p1.nome = "Nometbook";
        p1.preco = 2323.67;
        p1.desconto = 0.10;

        Produto p2 = new Produto();
        p2.nome = "Camera";
        p2.preco = 200.89;
        p2.desconto = 0.15;



        System.out.println("Digite o material");
        p1.nome = sc.nextLine();
        //System.out.printf("digite o preco");
        //p1.preco = sc.nextDouble();

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComdesconto();
        double precoFinal2 = p1.precoComdesconto();

        // FORMULA PARA FORMATAR O NUMERO.
        DecimalFormat formato = new DecimalFormat("#.##");
        String numeroFormatado = formato.format(precoFinal1);

        System.out.println("Preco final apos o desconto: " + numeroFormatado);

    }
}
