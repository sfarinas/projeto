package udemy.classes.Arrays3;

import java.util.Arrays;
// ARRAY É UM OBJETO, COM ISSO ELE TEM ATRIBUTOS E COMPORTAMENTOS
public class Exercicio3 {
    public static void main(String[] farina){
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 5.8;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 10;

        // FORMAS DE APRESENTAR O ARRAY
        // PRIMEIRA PRINT EM UM INDICE:
        System.out.println("Ultima nota "+ notasAlunoA[2]);

        // LISTAR O CONTEUDO DE UMA ARRAY
        System.out.println("Arrays.toString diretamente: " + Arrays.toString(notasAlunoA));

        // OU CRIAR UMA VARIAVEL PARA ARMAZENAR O : Arrays.toString( XXX VARIAVEL ARRAY XXX )
        // ---- ATENCAO ---- PARA LISTAR O CONTEDUDO DE UMA ARRAY, O CONTEUDO O JAVA ARMAZENA COMO STRING.
        // ENTAO A VARIAVEL PRECISA SER STRING.
        String lista = Arrays.toString(notasAlunoA);
        System.out.println("Arrays.toString na variavel: " + lista);

        // REALIZANDO A SOMA DOS INDICES E GUARDANDO EM UMA VARIAVEL total.
        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }

        // VERIFICANDO A SOMA
        System.out.println("SOMA DE TODOS OS INDICES: " + total);

        // REALIZANDO A MEDIA DA VARIAVEL TOTAL, É O PADRAO.
        // PERCEBEU QUE UTILIZAMOS O ( notasAlunoA.length ) E NAO O NUMERO 3, POR SER 3 INDICES,
        // UTILIZAMOS ISSO PARA NAO PRECISAR FICARMOS AMARRANDO O CODIGO AO NUMERO DE INDICES FIXOS.
        // DESTA FORA, É SO IR ACRECENTANDO MAIS INDICES, E O CODIGO IRA CONTINUAR FUNCIONANDO.
        System.out.println("MEDIA DAS NOTAS : " + total / notasAlunoA.length);

        // OUTRA FORMA DE CRICAR UM ARRAY COM DADOS LITERAIS
        double[] notaAlunoB = {6.7, 8.9, 7.5, 5.3};
        System.out.println("QUANTIDADES DE INDICES DO ALUNO B : " + notaAlunoB.length);
        System.out.println("INDICES DO ARRAY ALUNO B : " + Arrays.toString(notaAlunoB));

        // AGORA O PROCEDIMENTO DE MEDIA NORMAL AO DE CIMA.
        double totalB = 0;
        for (int i = 0; i < notaAlunoB.length; i++){
            totalB += notaAlunoB[i];
        }
        System.out.println(totalB / 3);

        // ------- DICA PARA PEGAR A ULTIMO INDICE DO ARRAY SEM PRECISAR SABER A QUANTIDADE DE INDICE.
        System.out.println("ULTIMO INDICE DO ARRAY : " + notaAlunoB[notaAlunoB.length - 1] );

    }
}
