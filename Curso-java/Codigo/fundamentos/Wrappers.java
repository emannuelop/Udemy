package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Byte b = 100; // byte
		
		Short s = 1000;
		
		//Integer.parseInt(leitor.next());
		Integer i = 10000; // int
		
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); // Tranformando em string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f =123.1F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
				
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		leitor.close();
	}
}
