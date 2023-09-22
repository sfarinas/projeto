package Exercicios;

import java.util.Scanner;

/** DIGA SE É NUMERO PRIMO OU NAO */
public class numeroPrimo {
    public static void main(String[] args) {
        int contadorDeDivisores = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                contadorDeDivisores++;
            }
        }
        if (contadorDeDivisores == 0 ){
            System.out.println(numero + " é um numero PRIMO!");
        } else {
            System.out.println(numero + " NÃO é um numero PRIMO!");
        }
        sc.close();
    }
}
