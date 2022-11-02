package controle.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int ano;
		
		System.out.print("Digite um ano: ");
		ano = leitor.nextInt();
			
		if(ano % 400 == 0) {
			System.out.println(ano + " ano bissexto");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " ano bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
		
		leitor.close();
	}
}
