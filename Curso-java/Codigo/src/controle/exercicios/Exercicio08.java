package controle.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String p;
		
		System.out.print("Digite um palavra: ");
		p = leitor.nextLine();
		
		char letras[] = p.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		leitor.close();
	}
}
