package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e iniciaçização
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // Variável foi declarada
		d = 123.65; // Variável foi inicializada
		System.out.println(d); // Variável foi usada!
		
		/*
		 * var e;
		 * e = 155.8 Não tem como fazer isso precisa, declara e logo já inicializar
		 * */
		
		var f = 12; // Inteiro
		// f = 12.01 não como fazer isso, pois a variável e do valor inteiro
		System.out.println(f);
	}
}
