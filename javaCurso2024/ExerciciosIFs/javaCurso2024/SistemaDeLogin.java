package javaCurso2024;

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

        // Primeira tentativa
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido! Bem-vindo.");
        } else {
            tentativas++;
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
            
            // Segunda tentativa
            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido! Bem-vindo.");
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
                
                // Terceira tentativa
                System.out.print("Digite o nome de usuário: ");
                usuario = scanner.nextLine();
                
                System.out.print("Digite a senha: ");
                senha = scanner.nextLine();
                
                if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    System.out.println("Login bem-sucedido! Bem-vindo.");
                } else {
                    tentativas++;
                    System.out.println("Acesso bloqueado após 3 tentativas erradas.");
                }
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
