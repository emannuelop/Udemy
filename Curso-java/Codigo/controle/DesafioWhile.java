package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double media = 0;
		double contador = 0; 
		double nota = 0;
		
		// ! signifca diferente
		while(nota != -1) {
			System.out.print("Digite uma nota "
					+ "(ou -1 p/ sair): ");
			nota = leitor.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				// media += nota;
				media = media + nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Nota invalida");
			}
		}
		
		media = media / contador;
		
		System.out.println(media);
		
		leitor.close();
	}
}
