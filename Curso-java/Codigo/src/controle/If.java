package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = leitor.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
		if(criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		
		leitor.close();
	}
}