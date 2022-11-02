package controle.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
				
		double n1, contador = 0;
		
		System.out.print("Digite um numero: ");
		n1 = leitor.nextDouble();
		
		for(int i = 2; i < n1; i++) {
			if (n1 % i == 0) {
				contador++;
			}
		}
		
		if (contador == 0) {
			System.out.println("Numero e primo");
		} else {
			System.out.println("Numero nao e primo");
		}
		
		leitor.close();
	}
}
