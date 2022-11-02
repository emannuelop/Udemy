package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int quantNotas = leitor.nextInt();
		
		double[] notas = new double[quantNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = leitor.nextDouble();
		}
		
		double soma = 0;
		for (double total : notas) {
			soma += total;
		}
		
		double media = soma / notas.length;
		System.out.print("Media: " + media);
		
		leitor.close();
		
	}
}
