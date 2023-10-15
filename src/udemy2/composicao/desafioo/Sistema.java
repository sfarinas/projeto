package udemy2.composicao.desafioo;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Julia Moraes");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 2034.89), 2);
        Compra compra2 = new Compra();
        compra2.adicionarItem("Mochila", 89.67, 3);
        compra2.adicionarItem(new Produto("Tenis", 150.78), 3);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
