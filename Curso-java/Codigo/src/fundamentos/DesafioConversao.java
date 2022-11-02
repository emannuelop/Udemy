package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		double num1;
		double num2;
		double num3;
		double media;
		
		System.out.print("Digite o seu salario 1: ");
		salario1 = leitor.nextLine().replace(",", ".");

		System.out.print("Digite o seu salario 2: ");
		salario2 = leitor.nextLine().replace(",", ".");
		
		System.out.print("Digite o seu salario 3: ");
		salario3 = leitor.nextLine().replace(",", ".");
		
		num1 = Double.parseDouble(salario1);
		num2 = Double.parseDouble(salario2);
		num3 = Double.parseDouble(salario3);
		
		media = (num1 + num2 + num3) / 3;
		
		System.out.println("A media dos salarios é: " + media);
		
		leitor.close();
	}
	
}
