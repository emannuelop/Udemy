package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double base;
		double altura;
		double res;
		
		System.out.print("Digite a base do triângulo: ");
		base = leitor.nextDouble();
		
		System.out.print("Digite a altura do triângulo: ");
		altura = leitor.nextDouble();
		
		res = (base * altura) / 2;
		
		System.out.println(res);
		
		leitor.close();
	}
}
