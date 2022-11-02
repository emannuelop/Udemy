package controle.exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double somador=0, numero=0;
		
		while(numero >=0) {
			System.out.print("Digite um numero: ");
			numero = leitor.nextDouble();
			
			if (numero >= 0) {
				somador += numero;
				System.out.println("Valor do samador " + somador);
			}
		}
		
		leitor.close();
	}
}
