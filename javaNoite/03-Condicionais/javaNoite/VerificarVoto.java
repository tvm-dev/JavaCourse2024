package javaNoite;

import java.util.Scanner;

public class VerificarVoto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
			
		//Solicita a idade do usuário:
		//Asks for user age:
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		//Verificar condições de voto:
		
		if( idade < 16 ) {
			System.out.println("Oops, você ainda não tem idade para votar!");
			
		} else if((idade >= 16 && idade < 18) || idade > 65 ) {
			System.out.println("Opa, seu voto é facultativo, mas vote, ajude a exercer a democracia!");
			
		} else if ( idade >= 18 && idade <= 65  ) {
			System.out.println("Opaa, seu voto é obrigatório, senão tem multa de R$ 3,50");
		}
		
		scanner.close();
			
			
		}

	}


