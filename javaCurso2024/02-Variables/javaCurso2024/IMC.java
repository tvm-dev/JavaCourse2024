package javaCurso2024;

import java.util.Scanner;

public class IMC {

    // Função para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Função para determinar a faixa de peso
    public static String faixaPeso(double imc) {
        if (imc < 18.5) {
            return "abaixo do peso. É importante procurar um profissional de saúde para uma avaliação.";
        } else if (imc < 24.9) {
            return "com o peso saudável. Continue mantendo um estilo de vida equilibrado!";
        } else if (imc < 29.9) {
            return "acima do peso. Considere adotar hábitos saudáveis e, se necessário, procure orientação profissional.";
        } else {
            return "obeso. É recomendável buscar ajuda de um profissional de saúde para orientação adequada.";
        }
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o peso e a altura
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura em metros (por exemplo, 1.75): ");
        double altura = scanner.nextDouble();
        
        // Verifica se a altura e o peso são positivos
        if (altura <= 0 || peso <= 0) {
            System.out.println("Peso e altura devem ser números positivos.");
            return;
        }
        
        // Calcula o IMC
        double imc = calcularIMC(peso, altura);
        
        // Determina a faixa de peso e a mensagem apropriada
        String faixa = faixaPeso(imc);
        
        // Exibe o resultado
        System.out.printf("\nSeu IMC é: %.2f\n", imc);
        System.out.println("Você está " + faixa);
        
        scanner.close();
    }
}
