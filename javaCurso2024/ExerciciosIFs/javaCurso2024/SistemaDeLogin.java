//Sistema de Login Local com while e bloqueio de login apos três tentativas!

package javaCurso2024;

import java.util.Scanner;

import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        // Variáveis fixas de nome de usuário e senha
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        
        // Número máximo de tentativas
        int tentativasMaximas = 3;
        int tentativas = 0; // Contador de tentativas
        
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Laço para tentar o login (usuário e senha)
        while (tentativas < tentativasMaximas) {
            // Solicita o nome de usuário
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
            
            // Solicita a senha
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            // Verifica se o nome de usuário e a senha estão corretos
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido! Bem-vindo.");
                break; // Login bem-sucedido, sai do loop
            } else {
                tentativas++; // Incrementa o número de tentativas
                if (tentativas < tentativasMaximas) {
                    System.out.println("Usuário ou senha incorretos. Tente novamente.");
                } else {
                    System.out.println("Acesso bloqueado após 3 tentativas erradas.");
                }
            }
        }
        
        // Fecha o scanner
        scanner.close();
    }
}

