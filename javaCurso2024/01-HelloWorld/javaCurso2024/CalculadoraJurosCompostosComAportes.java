package javaCurso2024;

import java.util.Scanner;

public class CalculadoraJurosCompostosComAportes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Informe o valor principal (R$): ");
        double principal = scanner.nextDouble();

        System.out.print("Informe a taxa de juros (% ao mês): ");
        double taxaJurosMensal = scanner.nextDouble();

        System.out.print("Informe o tempo (em meses): ");
        int meses = scanner.nextInt();

        System.out.print("Informe o valor dos aportes mensais (R$): ");
        double aporteMensal = scanner.nextDouble();

        // Cálculo dos juros compostos com aportes mensais
        double montante = principal;

        for (int i = 0; i < meses; i++) {
            // Primeiro aplica os juros ao montante existente
            montante *= (1 + (taxaJurosMensal / 100));
            // Depois adiciona o aporte mensal
            montante += aporteMensal;
        }

        double totalAportado = principal + (aporteMensal * meses);
        double juros = montante - totalAportado;

        // Resultado
        System.out.println("O valor dos juros compostos é: R$ " + juros);
        System.out.println("O valor total (principal + aportes + juros) é: R$ " + montante);

        scanner.close();
    }
}
