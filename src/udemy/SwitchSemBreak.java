package udemy;

import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner opp = new Scanner(System.in);

        String classe = "";
        int forca = 0;
        int inteligencia = 0;
        int destreza = 0;
        int life = 0;
        String nome = "";

        System.out.println("Digite o nome do seu personagem : ");
        nome = sc.next();
        System.out.println("Qual sua classe: /" +
                "\n 1 = ork \n 2 = humano \n 3 = elfo da floresta \n " +
                "4 = elfo da noite \n 5 = tigre \n ---DIGITE UMA OPCAO---");
        String op = sc.next();


        switch (op.toLowerCase()){
            case"1":
                classe = "ORK";
                forca = 50;
                inteligencia = 5;
                destreza = 25;
                life = 120;
                System.out.println("Voce 'e um "+classe+"  Verde e forte e nao tam inteligente");
                break;
            case "2":
                classe = "HUMANO";
                forca = 25;
                inteligencia = 30;
                destreza = 15;
                life = 100;
                System.out.println("Voce 'e um "+classe+"  da cidade central e tem seus atributos equilibrados");
                break;
            case "3":
                classe = "ELFO DA FLORESTA";
                forca = 29;
                inteligencia = 31;
                destreza = 20;
                life = 95;
                System.out.println("Voce 'e um "+classe+"  Verde e um o mais inteligente das outras classes");
                break;
            case "4":
                classe = "ELFO DA NOITE";
                forca = 20;
                inteligencia = 25;
                destreza = 29;
                life = 95;
                System.out.println("Voce 'e um "+classe+"  com uma destreza elevada, por ser um bom ladrao");
                break;
            case "5":
                classe = "TIGRE";
                forca = 34;
                inteligencia = 10;
                destreza = 25;
                life = 110;
                System.out.println("Voce 'e um "+classe+"  e com os atributos equilibrados para uma vida maior");
                break;
            default:
                System.out.println("Sou uma pedra");

        }
        System.out.println("Agora que vc 'e um " + classe + " voce esta na floresta");
        System.out.println("Seu Atributos sao: ");
        System.out.println("FORCA --------: " + forca + "\n" +
                "INTELIGENCIA -: " + inteligencia + "\n" +
                "DESTREZA -----: " + destreza + "\n" +
                "LIFE ---------: " +life);

        System.out.println("");
        System.out.println("======================================");
        System.out.println("");




        System.out.println("Conferindo seu nome, classes e atributos:");
        System.out.println("NOME ---------: " + nome);
        System.out.println("CLASSE -------: " + classe);
        System.out.println("Seu Atributos sao: ");
        System.out.println("FORCA --------: " + forca + "\n" +
                "INTELIGENCIA -: " + inteligencia + "\n" +
                "DESTREZA -----: " + destreza + "\n" +
                "LIFE ---------: " +life);

        sc.close();
    }
}