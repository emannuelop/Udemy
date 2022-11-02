package classe.desafio;

public class Pessoa {

	private String nome;
	private double peso;

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.pesoComida;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", peso = " + peso + "]";
	}

}
