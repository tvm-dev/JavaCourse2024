package javaCurso2024;

public class CondicionalBoolean {
	public static void main(String[] args) {
		
	

	int idade = 2;
	boolean acompanhado = false;

	if( idade >= 18 || acompanhado == true){
		System.out.println("Vocês podem encher a cara de cachaça!. Tipo do Acompanhado: "+acompanhado);
	} else {
		System.out.println("Você não pode comprar Bebida!. Tipo do Acompanhado: "+acompanhado);
	}
}
}

