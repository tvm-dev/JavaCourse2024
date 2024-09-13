package javaNoite;

import java.util.Scanner;

public class VerificarVoto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica as condições para votar
        if (idade < 16) {
            System.out.println("Oops, você ainda não tem idade para Votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 65) {
            System.out.println("Opa, seu Voto é facultativo, mas vote, ajude a exercer a democracia!");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Opaaa, seu Voto é obrigatório, senão votar, tem multa heim :)");
        }

        scanner.close();
    }
}
