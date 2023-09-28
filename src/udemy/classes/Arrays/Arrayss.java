package udemy.classes.Arrays;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.8;
        notasAlunoA[1] = 9.0;
        notasAlunoA[2] = 10.0;

        System.out.println("notasAlunoA[0] = 7.8");
        System.out.println("notasAlunoA[1] = 9.0");
        System.out.println("notasAlunoA[2] = 10.0");

        // VISUALIZAR AS NOTAS EM ARRAY, PRECISA CONVERTER PARA STRING
        String a = Arrays.toString(notasAlunoA);

        System.out.println("SEM CONVERTER FICA ASSIM "+notasAlunoA);
        System.out.println("CONVERTENDO FOCA ASSIM "+a);

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println("SOMA "+total);
        System.out.println("MEDIA "+total / notasAlunoA.length);

        double notaArmazenada = 9.9;
        double[] notasAlunoB = {6.9,4.5,notaArmazenada,10};
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("media aluno b "+totalAlunoB / notasAlunoB.length);

        String b = Arrays.toString(notasAlunoB);
        System.out.println(notasAlunoB.length);
        System.out.println(b);



        // ---- ARRAY AUTO CRESCENTE
        /**  @salomao
         *
         * double i = 0;
         *         double[] notasAlunoB = {i};
         *
         *          i = 10;
         *          double i1 = i;
         *          double i2 = i;
         *          double i3 = i;
         *          i = i++[i];
         * */

    }
}
