package Desafios;

import java.util.Scanner;

public class CalculadoraDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite um operador: ");
        String op = sc.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 - num2 : resultado;
        resultado = "%".equals(op) ? num1 - num2 : resultado;

        System.out.printf(String.valueOf(resultado));
        sc.close();
    }
}
