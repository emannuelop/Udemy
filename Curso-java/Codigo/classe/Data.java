package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// final String formato = "%d/%d/%d";
	
	String obterDataFormatada() {
		// String dataFinal = dia + "/" + mes + "/" + ano;
		// return dataFinal;
		final String formato = "%d/%d/%d"; // variáveis locais
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf("\n%d/%d/%d", dia, mes, ano);
	}
}
