package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double delta;
		double x1, x2;
		
		System.out.print("Digite o valor a: ");
		a = leitor.nextDouble();
		
		System.out.print("Digite o valor b: ");
		b = leitor.nextDouble();
		
		System.out.print("Digite o valor c: ");
		c = leitor.nextDouble();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Delta: " + delta);
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println(x1);
		
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println(x2);
		
		
		leitor.close();
	}
}
