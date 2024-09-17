/*
 * Exercício 2: Soma de Números Positivos
   Objetivo: Ler números do usuário até que ele insira um número negativo.
   Somar todos os números positivos inseridos.
 * */
package ExerciciosFor;
import java.util.Scanner;

public class SomarNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite um número (número negativo para sair): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            System.out.println("Digite outro número (número negativo para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos números positivos é: " + soma);
    }
}

