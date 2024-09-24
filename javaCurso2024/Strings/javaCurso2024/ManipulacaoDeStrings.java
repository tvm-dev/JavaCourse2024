package javaCurso2024;

public class ManipulacaoDeStrings {
    public static void main(String[] args) {
        // Criação de strings
        String texto = "Bem-vindo ao curso de Java!";
        String texto2 = "Vamos aprender sobre Strings.";

        // 1. Comprimento da string
        System.out.println("Comprimento da string: " + texto.length());

        // 2. Concatenar strings
        String textoCompleto = texto + " " + texto2;
        System.out.println("Texto completo: " + textoCompleto);

        // 3. Converter para maiúsculas e minúsculas
        System.out.println("Maiúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());

        // 4. Substituir uma parte da string
        String novoTexto = texto.replace("Java", "programação");
        System.out.println("Texto após substituição: " + novoTexto);

        // 5. Buscar por uma substring
        int posicao = texto.indexOf("curso");
        System.out.println("Posição da palavra 'curso': " + posicao);

        // 6. Verificar se uma string começa ou termina com uma substring
        System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));
        System.out.println("Termina com 'Java!': " + texto.endsWith("Java!"));

        // 7. Dividir uma string
        String[] palavras = textoCompleto.split(" ");
        System.out.println("Palavras no texto completo:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        // 8. Remover espaços em branco
        String textoComEspacos = "    Texto com espaços.   ";
        System.out.println("Texto sem espaços: '" + textoComEspacos.trim() + "'");
    }
}
