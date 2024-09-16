package javaCurso2024;

/*
 * Exercício 4: Verificar se um número é divisível por 3 e 5
Descrição: Crie um programa que receba um número inteiro do 
usuário e use a função if para verificar se o número é 
divisível tanto por 3 quanto por 5. Se for, exiba 
"O número é divisível por 3 e 5"; caso contrário, exiba 
"O número não é divisível por 3 e 5".
 * 
 * */

import java.util.Scanner;

public class DivisivelPor3e5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e 5.");
        } else {
            System.out.println("O número não é divisível por 3 e 5.");
        }
        
        scanner.close();
    }
}
