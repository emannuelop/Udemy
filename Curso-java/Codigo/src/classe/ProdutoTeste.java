package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		// p1.nome = "Notebook";
		p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		var p3 = new Produto("Banana", 5);
		System.out.println(p3.nome);
		System.out.println(p3.preco);
		
		System.out.println(p2.nome);
		System.out.println(p1.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}
}
