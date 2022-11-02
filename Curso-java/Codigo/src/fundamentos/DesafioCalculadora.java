package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		Scanner leitor = new Scanner(System.in);
		
		double num1;
		double num2;
		String operador;
		
		System.out.print("Digite um numero: ");
		num1 = leitor.nextDouble();
		
		System.out.print("Digite outro numero: ");
		num2 = leitor.nextDouble();
		
		System.out.print("Digite um operador: ex(+ ou - ou * ou / ou %) ");
		operador = leitor.next();
		
		// Lógico
		double res = "+".equals(operador) ? num1 + num2 : 0;
		res = "-".equals(operador) ? num1 - num2 : res;
		res = "*".equals(operador) ? num1 * num2 : res;
		res = "/".equals(operador) ? num1 / num2 : res;
		res = "%".equals(operador) ? num1 % num2 : res;
		
		System.out.println("Resultado: " + res);
		
		System.out.println(num1 + " " + operador + " " + num2);
		
		leitor.close();
	}
}
