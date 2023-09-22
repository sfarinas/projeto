package Exercicios;
import java.util.Scanner;

public class mediaDoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;

        System.out.println("Digite sua nota");
        String nota1 = sc.next().replace(",", ".");
        n1 = Double.parseDouble(nota1);

        System.out.println("Digite a segunda nota");
        String nota2 = sc.next().replace(",",".");
        n2 = Double.parseDouble(nota2);

        double media = (n1 + n2) / 2;

        if (media >= 7 && media <= 10){
            System.out.println("APROVADO !");
        }else if (media >= 4 && media <= 6.9){
            System.out.println("RECUPERACAO ");
        } else if (media >= 0 && media <= 3.9) {
            System.out.println("REPROVADO ");
        } else {
            System.out.println("NOTA INVALID");
        }

        System.out.println(media);

        sc.close();
    }
}
