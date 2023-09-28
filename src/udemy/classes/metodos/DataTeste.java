package udemy.classes.metodos;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int d1 = 25;
         int d2 = 06;
         int d3 = 1979;

         // DATA DO CONSTRUTOR PADRAO 1/1/1970
        Data dn = new Data();


        Data dt = new Data(31, 8, 1978);


        System.out.println("Digite o dia do seu niver: ");
        d1 = sc.nextInt();
        System.out.println("Digite o mes do seu niver: ");
        d2 = sc.nextInt();
        System.out.println("Digite o ano do seu narcimento: ");
        d3 = sc.nextInt();

        String dataFormatada = dn.obterDataFormatada();

        System.out.println("Sua data formatada " + dataFormatada);
        dt.imprimirDataFormatada();




    }
}
