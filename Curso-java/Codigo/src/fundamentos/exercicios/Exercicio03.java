package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double altura;
		double peso;
		double res;
		
		System.out.println("Digite o seu altura: ");
		altura = leitor.nextDouble();
		
		System.out.println("Digite o seu peso: ");
		peso = leitor.nextDouble();
		
		res = peso / (altura * altura);
		
		System.out.println(res);
		
		leitor.close();
	}
}
