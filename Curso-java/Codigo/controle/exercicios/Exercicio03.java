package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Digite a nota 1: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		n2 = leitor.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media >= 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		leitor.close();

	}
}
