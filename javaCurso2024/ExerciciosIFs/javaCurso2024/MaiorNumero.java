/*
 * Exercício 5: Comparar dois números e verificar qual é maior
Descrição: Escreva um programa que receba dois números inteiros 
do usuário e use a estrutura if para verificar qual número é maior.
 O programa deve exibir qual dos  números é maior ou, caso sejam iguais, 
 informar que os números são iguais.
 * 
 * */


package javaCurso2024;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else if (num1 < num2) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
        
        scanner.close();
    }
}

