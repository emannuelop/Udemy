package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double f;
		double res;
		
		System.out.println("Digite uma temperatura em fahrenheit: ");
		f = leitor.nextDouble();
		
		res = (f - 32) / 1.8;
		
		System.out.println(res);
		
		leitor.close();
	}
}
