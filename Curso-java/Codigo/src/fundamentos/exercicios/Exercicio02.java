package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double c;
		double res;
		
		System.out.println("Digite uma temperatura em celsius: ");
		c = leitor.nextDouble();
		
		res = (c * 1.8) + 32;
		System.out.println(res);
		
		leitor.close();
	}
}
