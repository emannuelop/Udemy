package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double n1;
		double res1;
		double res2;
		
		System.out.print("Digite um valor: ");
		n1 = leitor.nextDouble();
		
		res1 = Math.pow(n1, 2);
		res2 = Math.pow(n1, 3);
		
		System.out.println(res1);
		System.out.println(res2);
		
		leitor.close();
	}
}
