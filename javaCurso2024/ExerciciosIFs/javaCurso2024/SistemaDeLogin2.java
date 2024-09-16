//Sistema de Login Local

package javaCurso2024;

import java.util.Scanner;

public class SistemaDeLogin2 {
    public static void main(String[] args) {
        // Variáveis fixas de nome de usuário e senha
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o nome de usuário
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();
        
        // Solicita a senha
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        // Verifica nome de usuário e senha com if-else
        if (usuario.equals(usuarioCorreto)) {
            if (senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido! Bem-vindo.");
            } else {
                System.out.println("Erro: Senha incorreta.");
            }
        } else {
            System.out.println("Erro: Nome de usuário incorreto.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
