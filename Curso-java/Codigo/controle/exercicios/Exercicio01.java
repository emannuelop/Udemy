package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double n1;
		
		System.out.print("Digite um valor: ");
		n1 = leitor.nextDouble();
		
		if(n1 <= 10 && n1 >= 0) {
			System.out.println("O numero esta entre 0 e 10");
		} else {
			System.out.println("O numero não esta entre 0 e 10");
		}
		
		if(n1 % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}
		
		leitor.close();
	}
}
