package udemy;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sair = "";


        while (!sair.equalsIgnoreCase("sair")){
            System.out.println
                    ("O programa so vai parar quando digitar sair");
            sair = sc.next();
        }
        sc.close();
    }
}
