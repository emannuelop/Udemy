package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner leitor = new Scanner(System.in);
		
									   // next tira os espaços em brancos
		String s2 = leitor.nextLine(); // nextLine não tira os espaços em brancos
		System.out.println(s2);
		System.out.println("2" == s2.trim()); // trim tira os espaços em brancos
		System.out.println("2".equals(s2.trim()));
		
		leitor.close();
	}
}
