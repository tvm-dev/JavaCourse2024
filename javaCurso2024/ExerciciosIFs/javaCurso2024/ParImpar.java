/*
 *
 *Exercício 1: Verificar se um número é positivo, negativo ou zero
  Descrição: Escreva um programa que receba um número inteiro do usuário e
  use a estrutura if para verificar se o número é positivo, negativo ou zero. 
  O programa deve imprimir uma mensagem apropriada com base no valor fornecido.
 * */


package javaCurso2024;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        
        scanner.close();
    }
}
