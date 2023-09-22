package Exercicios;

import java.util.Scanner;

public class AnoBissexto {
    /** INFORME SE O ANO É BISEXTO */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano : ");
        int ano = sc.nextInt();

        boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0
        || ano % 400 == 0);

        if (bissexto == true){
            System.out.println("O ano " + ano + ", é Bisexto !");
        } else {
            System.out.println("O ano " + ano + ", NÃO é Bisexto !");
        }
        sc.close();
    }
}
