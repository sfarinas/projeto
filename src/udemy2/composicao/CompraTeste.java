package udemy2.composicao;

import java.util.Scanner;

public class CompraTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item item = new Item("Caneta",20, 7.25);
        Item item1 = new Item("Borracha",30,3);

        String NomeItem = item.nome;

        //System.out.println("Digite o item : ");
        //NomeItem = sc.nextLine();

        Compra compra1 = new Compra();
        compra1.cliente = "Joao";

        compra1.adicionarItem(NomeItem, 20, 7.25);
        compra1.adicionarItem(new Item("Borracha", 30, 3.00));
        compra1.adicionarItem(new Item("Lapis", 15, 1.50));
        compra1.adicionarItem(new Item("Caderno", 18, 18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.GetValorTotal());

        //double total = compra1.GetValorTotal();
        double itemTotal = item.preco * item.quantidade;
        double itemTotal1 = item1.preco * item1.quantidade;

        System.out.println("Preco do item "+ NomeItem +" "+ itemTotal);
        System.out.println("Preco do item "+ NomeItem +" "+ itemTotal1);
        System.out.println(itemTotal1);
    }
}
