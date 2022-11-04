package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom ");
		System.out.println("dia!");
		
		// Pode ser \n ou %n é a mesma coisa
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Salário: %s%n", "João");
		
		// Scanner, pegando dados do usario
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = leitor.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = leitor.nextInt();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		leitor.close();
	}
}
