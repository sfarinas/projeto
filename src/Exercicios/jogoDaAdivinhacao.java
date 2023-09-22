package Exercicios;
import java.util.Random;
import java.util.Scanner;
public class jogoDaAdivinhacao {
    /** JOGO DA ADIVINHACAO */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        do {
            System.out.println("----- Sorteando numero entre 0 e 100 ------ \n");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Começou o jogo! Sera que consegue me vencer?");
            tentativas = 0;

            do {
                tentativas++;
                System.out.println("Tentativas " + tentativas);
                numero = sc.nextInt();
                System.out.println("=================================");

                if (numero > numeroSorteado){
                    System.out.println("O numero sorteador é menor que " + numero);
                } else if (numero < numeroSorteado) {
                    System.out.println("O numero sorteado é maior que " + numero);
                } else {
                    System.out.println("Parabens vc acertou o numero que é " + numero);
                    break;
                }
            }while (tentativas != 10);
            System.out.println(" Digite 0 para sair, ou qualquer outro numero para continuar, O numero Sorteado era " + numero);
            continuar = sc.nextInt();

        } while (continuar != 0);

        sc.close();
    }
}
