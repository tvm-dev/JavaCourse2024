package javaCurso2024;

public class CVariablesConversions {
	public static void main(String[] args) {
		
		//===== 
		double salary = 3050.55;
		int valueSalary = (int) salary; //it's works! ******* but loss of precision
	//	System.out.println("The Salary is " + valueSalary); -> Incompatibilidade de tipo: não é possível converter de double para int
		System.out.println("The Salary is " + valueSalary); //-> loss of precision occurs in this line! 
		
	
	
		
	}

}
