/*
 * Exercício 4: Validação de Login com Tentativas
Objetivo: Implementar um sistema de login que permite 3 tentativas usando while.
 * */

package ExerciciosFor;

import java.util.Scanner;

public class ValidarLogin {
    public static void main(String[] args) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        int tentativas = 0;
        int tentativasMaximas = 3;
        Scanner scanner = new Scanner(System.in);

        while (tentativas < tentativasMaximas) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos. Tentativa " + tentativas + " de " + tentativasMaximas);
            }

            if (tentativas == tentativasMaximas) {
                System.out.println("Acesso bloqueado após 3 tentativas erradas.");
            }
        }
    }
}
