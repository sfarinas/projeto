package adrianaSissu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.print("Digite um numero : ");
        n1 = Integer.parseInt(sc.nextLine());

        if (n1 % 2 == 0 && n1 % 3 == 0){
            System.out.println("------------ NUMERO DIVIVEL POR 2 E 3 --------------");
        }else {
            System.out.println("------------ NUMERO NÃO DIVIVEL POR 2 E 3 ------------");
        }

    }
}