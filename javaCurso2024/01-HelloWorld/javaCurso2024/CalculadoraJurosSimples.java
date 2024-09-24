package javaCurso2024;

import java.util.Scanner;

public class CalculadoraJurosSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Informe o valor principal (R$): ");
        double principal = scanner.nextDouble();

        System.out.print("Informe a taxa de juros (%): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Informe o tempo (em anos): ");
        int tempo = scanner.nextInt();

        // Cálculo dos juros simples
        double juros = (principal * taxaJuros * tempo) / 100;

        // Resultado
        System.out.println("O valor dos juros é: R$ " + juros);

        double valorTotal = principal + juros;
        System.out.println("O valor total (principal + juros) é: R$ " + valorTotal);

        scanner.close();
    }
}
