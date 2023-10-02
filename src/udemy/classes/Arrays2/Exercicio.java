package udemy.classes.Arrays2;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        String n1 = Arrays.toString(notasAlunoA);
        System.out.println(n1);

        // UTILIZAR [ notasAlunoA.length ], FAZ COM QUE NAO PRECISE FIXAR UM VALOR UNICO, TIPO
        /**
         * PARA REALIZAR A SOMA, NAO PRECISO FIXAR O VALOR 3 EM :
         * for (int i = 0; i < 3; i++)
         * O NUMERO 3 SERIA O NUMERO DE ARRAY, E É SOBISTITUIDO POR UM ATRIBUTO QUE EXISTE NO ARRYA.UTIL
         * .length
         */
        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        double media = total / notasAlunoA.length;
        System.out.println("Aluno A : "+media);

        // OUTRA FORMA DE CRIAR UM ARRAY
        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        double totalB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalB += notasAlunoB[i];
        }
        System.out.println("Aluno B : "+totalB / notasAlunoB.length);
    }
}
