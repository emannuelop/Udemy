package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		// float b = 1.12345888888F; forma mais silmples de fazer
		float b = (float) 1.12345888888; // conversão  explícita (CAST)
		System.out.println(b);
		
		int c = 120;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // conversão explícita (CAST)
		System.out.println(f);
	}
}
