package javaCurso2024;


	public class Utilidades {

	    // Método 1: Soma dois números inteiros e retorna o resultado
	    public int somar(int a, int b) {
	        return a + b;
	    }

	    // Método 2: Verifica se um número é par ou ímpar
	    public String verificarParOuImpar(int numero) {
	        if (numero % 2 == 0) {
	            return "O número " + numero + " é par.";
	        } else {
	            return "O número " + numero + " é ímpar.";
	        }
	    }

	    // Método 3: Calcula o fatorial de um número
	    public int calcularFatorial(int numero) {
	        int fatorial = 1;
	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }

	    // Método 4: Exibe uma saudação personalizada
	    public void exibirSaudacao(String nome) {
	        System.out.println(nome + "! Seja bem-vindo.");
	    }

	    // Método 5: Inverte uma string
	    public String inverterString(String texto) {
	        StringBuilder sb = new StringBuilder(texto);
	        return sb.reverse().toString();
	    }

	    // Método main para testar os métodos
	    public static void main(String[] args) {
	        Utilidades util = new Utilidades();
	        
	        // Testando os métodos
	        System.out.println("1) Soma de 5 e 3: " + util.somar(5, 3));
	        System.out.println("2) "+util.verificarParOuImpar(4));
	        System.out.println("3) Fatorial de 5: " + util.calcularFatorial(5));
	        util.exibirSaudacao("4) "+ "Thiago");
	        System.out.println("5) Inversão da string 'Java': " + util.inverterString("Java"));
	    }
	}

	
	
	
	
