package Exercicios;

import java.util.Scanner;

public class EntreZeroEDezEPar {
    public static void main(String[] args) {
        //int a = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int a = sc.nextInt();


        if (a >= 0 && a <= 10){
            if (a % 2 == 0){
                System.out.println(a + " este numero esta entre Zero e 10, e é PAR !");
            } else {
                System.out.println(a + " Este numero nao é PAR, e sim IMPAR .");
            }

        } else {
            System.out.println(a + " Este numero nao é par e nao esta sentre ZERO e 10.");
        }


    }
}
