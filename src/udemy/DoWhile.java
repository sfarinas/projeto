package udemy;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sair = "";

        do {
            System.out.println("Digite Sair !");
            sair = sc.next();
        } while (!sair.equalsIgnoreCase("sair"));

        System.out.println("Saimos");
        sc.close();
    }
}
