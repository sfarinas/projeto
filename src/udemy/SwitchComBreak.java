package udemy;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String faixa = "branca";
        //int nota = 7;
        System.out.printf("Qual a sua faixa : ");
        faixa = sc.next();

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.printf("Sei fazer a GAGE DAMA");
            break;
            case "marrom":
                System.out.printf("Sei fazer o KAMERAME RA");
                break;
            default:
                System.out.printf("Nao sei fazer nada");
        }


    }
}
