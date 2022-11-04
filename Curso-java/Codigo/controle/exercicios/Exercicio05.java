package controle.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n1, contador = 0;
		
		System.out.print("Digite um numero: ");
		n1 = leitor.nextInt();
		
		for(int i = 2; i < n1; i++) {
			if (n1 % i == 0) {
				contador++;
			}
		}
		
		switch (contador) {
		case 0:
			System.out.println("Numero e primo");
			break;
			
		default:
			System.out.println("Numero nao e primo");
		}
		
		leitor.close();
	}
}
