/*
 * Exercício 3: Verificar se uma pessoa é maior de idade
Descrição: Escreva um programa que receba a idade de uma 
pessoa e use a estrutura if para verificar se ela é maior
 de idade (18 anos ou mais). Se for maior de idade, exiba a
  mensagem "Você é maior de idade"; 
caso contrário, exiba "Você é menor de idade"
 * 
 * */

package javaCurso2024;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        scanner.close();
    }
}
