package udemy.classes.Arrays.Desafio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class mediaUva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota "+ (i + 1 ) + " do aluno: ");
            notas[i] = sc.nextDouble();


        }
        String a = Arrays.toString(notas);
        System.out.print(a);

        System.out.println();
        //System.out.println("media aluno  "+ totalAluno / notas.length);



    }
}
