package javaCurso2024;

public class TrabalhandoComClasses {

    // Método 1: Calcula a soma de dois números inteiros
    public int soma(int a, int b) {
        return a + b;
    }

    // Método 2: Verifica se um número é par
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    // Método 3: Inverte uma string
    public String inverteString(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    // Método 4: Calcula o fatorial de um número
    public int fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }

    // Método 5: Encontra o maior número em um array de inteiros
    public int maiorNumero(int[] numeros) {
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        TrabalhandoComClasses util = new TrabalhandoComClasses();

        // Chamando os métodos
        System.out.println("Soma de 5 e 3: " + util.soma(5, 3));
//        System.out.println("O número 4 é par? " + util.ehPar(4));
//        System.out.println("String invertida de 'Java': " + util.inverteString("Java"));
//        System.out.println("Fatorial de 5: " + util.fatorial(5));
//        int[] numeros = {1, 3, 7, 2, 5};
//        System.out.println("O maior número no array é: " + util.maiorNumero(numeros));
    }
}
