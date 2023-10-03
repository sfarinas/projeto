package udemy.classes.Arrays3.Desafio;
import java.util.Arrays;
import java.util.Scanner;

    /**
     * CRIE UM APLICATIVO QUE CALCULE A MEDIA DO ALUNO,
     * UTILIZANDO 2 FOR, UM PARA ENTRAR AS NOTAS E OUTRO
     * PARA CALCULAR A MEIA.
     * A ENTRADA DE DADOS É MANUAL.
     */
public class DesafioArray {
    public static void main(String[] farina) {
        Scanner sc = new Scanner(System.in);
        // QUANTIDADES DE NOTAS.
        System.out.println("Calcular a media de quantas notas: ");
        System.out.print("Quantas notas: ");

        int qtdNotas = sc.nextInt();

        // ARRAY COM A QTD DE NOTAS.
        double[] notas = new double[qtdNotas];

        // ATRELANDO AS NOTAS AOS INDICES, MANUALMENTE.
        for (int i = 0; i < notas.length; i++){
            System.out.print("Informe a nota " + (i + 1) + ": ");
            // VARIAVEL n DO TIPO String, ESTA RECEBENDO O VALOR DIGITADO NA VARIAVEL sc
            // E UTILIZANDO O PAREMETRO ".replace" QUE SO TEM NO TIPO String PARA TROCAR
            // TODO "," DIGITADO POR PONTO "."
            String n = sc.next().replace(",",".");
            // CONVERTENDO O CONTEDUDO DIGITADO NA VARIAVEL n PARA DOUBLE.
            notas[i] = Double.parseDouble(n);
        }
        // TESTE DE ENTRADA DE NOTAS.
        System.out.println(Arrays.toString(notas));

        // SOMANDO OS INDICES.
        double total = 0;
        for (double nota: notas){
            total += nota;
        }
        System.out.println("A media é : " + total / notas.length);
        sc.close();
    }
}
