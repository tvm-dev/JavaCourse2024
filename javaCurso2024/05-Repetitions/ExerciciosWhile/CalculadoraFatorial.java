/*
 * ### **Exercício 5: Calculadora de Fatorial**
**Objetivo**: Calcular o fatorial de um número fornecido pelo usuário usando `while`.
 * */

package ExerciciosWhile;

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        int contador = numero;

        while (contador > 1) {
            fatorial *= contador;
            contador--;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

