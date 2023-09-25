package udemy.classes;
public class produtoTeste {
    public static void main(String[] args) {

        produto p1 = new produto("Notebook");
        p1.nome = "Notebook";
        p1.preco = 4320.89;
        p1.desconto = 0.25;

        produto p2 = new produto("Caneta");
        p2.nome = "Caneta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome + " Preco R$ " + p1.preco);
        System.out.println(p2.nome + " Preco R$ " + p2.preco);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        System.out.printf("Seu desconto é R$ %.2f\n", precoFinal1);
        System.out.printf("Seu desconto é R$ %.2f ", precoFinal2, "\n");
    }
}
