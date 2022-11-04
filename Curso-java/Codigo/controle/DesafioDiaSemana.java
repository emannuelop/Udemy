package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String dia;
		
		System.out.print("Digite um dia da semana: ");
		dia = leitor.next();
		
		dia = dia.toLowerCase();
		
		if("domingo".equals(dia)) {
			System.out.println(1);
		} else if ("segunda".equals(dia)) {
			System.out.println(2);
		} else if ("terça".equals(dia)) {
			System.out.println(3);
		} else if ("quarta".equals(dia)) {
			System.out.println(4);
		} else if ("quinta".equals(dia)) {
			System.out.println(5);
		} else if ("sexta".equals(dia)) {
			System.out.println(6);
		} else if ("sábado".equals(dia)) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!");
		}
		
		/* Outra forma de fazer
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}
		*/
		
		leitor.close();
	}
}
