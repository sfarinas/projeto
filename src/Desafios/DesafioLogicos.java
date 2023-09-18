package Desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terca V ou F
        // Trabalho na quinta V ou F

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou uma TV de 50\"? " + comprouTV50);
        System.out.println("Comprou uma TV de 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouTV32);
        System.out.println("Mais saudadvel ? " + !comprouSorvete);

    }
}
