package controle;

public class For1 {
	public static void main(String[] args) {
		
		/*
		int contador = 1;
		while(contador <=10) {
			System.out.println(contador);
			contador++;
		}
		*/
		
		for(int contador = 1; contador <=10; contador++) {
			System.out.println(contador);
		}
		
		int x = 1;
		for(; x <= 10;) {
			System.out.println("x = " + x);
			x++;
		}
	}
}
