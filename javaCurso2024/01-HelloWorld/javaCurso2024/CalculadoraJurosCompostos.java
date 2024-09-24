package javaCurso2024;

import java.util.Scanner;

public class CalculadoraJurosCompostos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.println("=== Calculadora de Juros Compostos ===");
        System.out.println("--------------------");
        System.out.print("Informe o valor principal (R$): ");
        double principal = scanner.nextDouble();

        System.out.print("Informe a taxa de juros (% ao ano): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Informe o tempo (em anos): ");
        int tempo = scanner.nextInt();

        // Cálculo dos juros compostos (compostos anualmente)
        double montante = principal * Math.pow(1 + (taxaJuros / 100), tempo);
        double juros = montante - principal;

        // Resultado
        System.out.println("O valor dos juros compostos é: R$ " + juros);
        System.out.println("O valor total (principal + juros) é: R$ " + montante);

        scanner.close();
    }
}

