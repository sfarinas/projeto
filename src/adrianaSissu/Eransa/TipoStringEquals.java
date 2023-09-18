package adrianaSissu.Eransa;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2" ? "SIM" : "NAO");
        String a = "2";
        String s = new String("2");
        System.out.println("2" == a ? "SIM" : "NAO");
        System.out.println("2" == s ? "SIM" : "NAO");
        System.out.println("2" .equals(s) ? "SIM" : "NAO");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        String s2 = sc.nextLine().trim();
        System.out.println("2".equals(s2) ? "SIM" : "NAO");

        sc.close();
    }
}
