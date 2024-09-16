/*
Exercício Avançado: Sistema de Classificação de Notas
Descrição: Escreva um programa que receba a nota de um estudante
(um número entre 0 e 100) e classifique-o em
diferentes faixas de desempenho, utilizando ifs aninhados. 
A classificação é a seguinte:

Nota maior ou igual a 90: A (Excelente)
Nota entre 80 e 89: B (Muito Bom)
Nota entre 70 e 79: C (Bom)
Nota entre 60 e 69: D (Regular)
Nota abaixo de 60: F (Reprovado)
O programa deve ainda verificar se o valor digitado está entre 0 e 100. Caso contrário, exiba uma mensagem de erro indicando que a nota é inválida.
 * */
package javaCurso2024;

import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a nota ao usuário
        System.out.print("Digite a nota do aluno (entre 0 e 100): ");
        int nota = scanner.nextInt();
        
        // Verifica se a nota está dentro do intervalo válido
        if (nota >= 0 && nota <= 100) {
            if (nota >= 90) {
                System.out.println("Classificação: A (Excelente)");
            } else if (nota >= 80) {
                System.out.println("Classificação: B (Muito Bom)");
            } else if (nota >= 70) {
                System.out.println("Classificação: C (Bom)");
            } else if (nota >= 60) {
                System.out.println("Classificação: D (Regular)");
            } else {
                System.out.println("Classificação: F (Reprovado)");
            }
        } else {
            // Caso a nota esteja fora do intervalo permitido
            System.out.println("Nota inválida. Digite um valor entre 0 e 100.");
        }
        
        scanner.close();
    }
}

