package Desafios;

import java.util.Scanner;

public class desafioCalculara {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double numero1, numero2;
            char operacao;

            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            operacao = scanner.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        }
    }

