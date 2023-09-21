package udemy.desafios;

import java.util.Scanner;
public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double total = 0;
        int qtdNotas = 0;

        while (nota != -1) {
            qtdNotas++;
            System.out.print("Digite a " + qtdNotas + "º nota : ");
            nota = sc.nextDouble();
            qtdNotas--;

            if (nota <= 10 && nota >= 0){
                total += nota;
                qtdNotas++;
            } else if (nota != -1){
                System.out.println("======== Nota invalid ========");
            }
        }

        double media = total / qtdNotas;
        System.out.println("Media = " + media);


        sc.close();

    }
}
