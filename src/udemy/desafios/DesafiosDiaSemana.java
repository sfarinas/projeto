package udemy.desafios;

import java.util.Scanner;
public class DesafiosDiaSemana {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o dia da semana: ");
    String dia = sc.next().toUpperCase();
    
    if (dia.equals("DOMINGO")){
        System.out.println("1");
    } else if (dia.equals("SEGUNDA")) {
        System.out.println("2");
    } else if (dia.equals("TERCA") || dia.equals("TERÇA")) {
        System.out.println("3");
    } else if (dia.equals("QUARTA")) {
        System.out.println("4");
    } else if (dia.equals("QUINTA")) {
        System.out.println("5");
    } else if (dia.equals("SEXTA")) {
        System.out.println("6");
    } else if (dia.equals("SABADO") || dia.equals("SÁBADO")) {
        System.out.println("7");
    }else {
        System.out.println("DIA INVALIDO");
        return;
    }

        sc.close();
    }

}
