/*
 * Exercício 3: Verificar Se um Número é Primo
Objetivo: Verificar se um número fornecido pelo usuário é primo usando while.
 * */

package ExerciciosFor;

import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int divisor = 2;
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            while (divisor <= numero / 2) {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
