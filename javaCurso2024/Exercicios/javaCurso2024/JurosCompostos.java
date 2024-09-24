package javaCurso2024;


	import java.text.NumberFormat;
	import java.util.Locale;
	import java.util.Scanner;

	public class JurosCompostos {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entradas do usuário
	        System.out.print("Digite o capital inicial (em R$): ");
	        double capital = scanner.nextDouble();

	        System.out.print("Digite a taxa de juros anual (em %): ");
	        double taxaJuros = scanner.nextDouble() / 100;

	        System.out.print("Digite o número de anos: ");
	        int anos = scanner.nextInt();

	        // Fórmula de juros compostos: M = C * (1 + i)^n
	        double montante = capital * Math.pow((1 + taxaJuros), anos);

	        // Formatação em moeda brasileira (BRL)
	        Locale brasil = new Locale("pt", "BR");
	        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

	        // Saída formatada
	        System.out.printf("O montante final após %d anos será de %s%n", anos, formatoMoeda.format(montante));
	        
	        scanner.close();
	    }
	}
