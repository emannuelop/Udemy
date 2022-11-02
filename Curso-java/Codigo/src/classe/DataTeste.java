package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data();
		
		Data d3 = new Data();
		System.out.println(d3.obterDataFormatada());
		
		Data d4 = new Data(11, 9, 1990);
		System.out.println(d4.obterDataFormatada());
		
		d1.dia = 28;
		d1.mes = 4;
		d1.ano = 1972;
		
		d2.dia = 22;
		d2.mes = 9;
		d2.ano = 2003;
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);
		System.out.println("\n" + d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
