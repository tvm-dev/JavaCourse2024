package javaCurso2024;

import java.util.Scanner;

public class ContadorVogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me fale uma palavra: ");
        String n1 = sc.nextLine();

        int cont = contarVogais(n1);
        System.out.println("A frase possui " + cont + " vogais");

        sc.close(); // Fechar o Scanner
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        frase = frase.toLowerCase(); // Converter a frase para minúsculas
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i); // Obter o caractere
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++; // Contar o caractere se for vogal
            }
        }
        return contador;
    }
}
