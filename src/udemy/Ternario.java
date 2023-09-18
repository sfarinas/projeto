package udemy;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media ;

        while (true){
            System.out.println("Digite sua media : ");
            try {
                media = Double.parseDouble(sc.nextLine());
                if (media >= 0.0 && media <= 10.0){
                    break;
                }else {
                    System.out.println
                            ("Valor incorreto. A Media deve estar etre 0.0 e 10.0");
                }
            }catch (NumberFormatException e){
                System.out.println("Valor incorreto. Insira um numero valido.");
            }
        }
        String resultado = media >= 7.0 ?" Aprovado " :
                (media >= 5.0 ? "em Recuperação" : "Reprovado");
        System.out.println("O aluno esta " + resultado);

        sc.close();


    }
}
