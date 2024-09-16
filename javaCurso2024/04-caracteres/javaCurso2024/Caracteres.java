/*
 * O que é a tabela Unicode?

A tabela Unicode é um padrão internacional que atribui um número único
 (ponto de código) a cada caractere, incluindo letras, números, símbolos
  e caracteres de idiomas diferentes. Isso permite que diferentes sistemas
 e programas possam representar e exibir caracteres de forma consistente. 
 * */
package javaCurso2024;

public class Caracteres {
	public static void main(String[] args) {
		//char tem que representar um numero na tabela unicode!
		char valor1 = 544;
		char valor2 = 666;
		char valor3 = 64;
		char valor4 = 633;
		
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
		
		//Atribuição de valores:
		int primeiro = 10;
		int segundo = 1299;
		
		segundo = primeiro;
		primeiro = 140;
		System.out.println(primeiro);
		System.out.println(segundo);
		
		
		
	}

}
