package javaCurso2024;

public class AVariablesInteger {
	public static void main(String[] args) {
		
		//Give explanation to students about: case sensitive and camelCase

		//Integer number:
		int age = 12;
		
		//variable reassignment
		age = 15;
		
		//String
		String cep;
		cep = "08421-130";
		
		//Sum
		int sum = 13 + 2;
		//subtraction
		int sub = 10 - 5;
		//Division
		int div = 100 / 3;
		//multiplication:
		int mult = 15 * 3;
		
		
		//order of mathematical operators
		
		//Sum before:
		int mult2 = 15 * (3 + 2);
		
		//Div before:
		int div2 = 15 / (3 + 2);
		
		//Sub before:
		int sub2 = 15 - (3 + 2);
		
		float flutuantPoint = (float) 3.14;
		
		//For very large values, do not use int, use Long
		long bigNumber = 5454543212134444531L;
		
		//For little numbers, use short:
		short litteNumber = 3245;
		
		//for bit:
		byte minimalNumber = 127; //maxim number to byte, 127! 
		
		
		
		//============= Messages ==============
		//show variables on console:
		System.out.println(age);
		System.out.println(cep);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mult);
		//With texts(concatenation):
		System.out.println("The Mult 15 and 3 is " + mult);
		System.out.println(mult2);
		System.out.println(div2);
		System.out.println(sub2);
		System.out.println(bigNumber);
		System.out.println(minimalNumber);
		System.out.println(flutuantPoint);
		
	}

}
