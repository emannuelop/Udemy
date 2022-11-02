package controle.exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double maiorNumero=0, n1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			n1 = leitor.nextDouble();
			
			if(n1 > maiorNumero) {
				maiorNumero = n1;
			}
		}
		
		System.out.println("Maior numero e " + maiorNumero);
		
		leitor.close();
	}
}
