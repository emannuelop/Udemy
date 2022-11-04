package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("Emannuel", 66);
		System.out.println(p.toString());
		p.comer(c1);
		p.comer(c2);
		System.out.println(p.toString());
	}
}
