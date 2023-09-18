package Exercicios;

import java.util.Scanner;

public class ConverterCelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a temperatura em Celsios: ");
        double celsios = sc.nextDouble();

        double fahrenheit = (celsios * 9/5) + 32;

        System.out.printf(String.valueOf(fahrenheit));
    }
}
