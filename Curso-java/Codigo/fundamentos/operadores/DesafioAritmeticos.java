package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		// Desafio
		double n1 = (6 * (3 + 2));
		double n2 = 3 * 2;
		n1 = Math.pow(n1, 2);
		n1 = n1 / n2;
		
		double n3 = (1 - 5) * (2 - 7);
		double n4 = 2;
		n4 = Math.pow(n4, 2);
		n3 = Math.pow(n3, 2);
		n3 = n3 / n4;
		
		double n5 = n1 - n3;
		double n6 = 10;
		
		n5 = Math.pow(n5, 3);
		n6 = Math.pow(n6, 3);
		
		double resultado = n5 / n6;
		
		System.out.println("Resultado: " + resultado);
		
		// Outro jeito de fazer
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double res = superior / inferior;
		System.out.println("Resultado: " + res);
	}
}
