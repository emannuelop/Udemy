package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() { // Construtor
		
	}
	
	Produto(String nomeInicial) { // Construtor
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial) { // Construtor
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
