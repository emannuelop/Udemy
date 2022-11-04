package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento 
		// quando a fila está cheia!
		fila.add("Ana"); // Retorna um erro se não consegue adiciona
		fila.offer("Bia"); // Retorna false se não consegue adiciona
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento 
		// da fila (sem remover)
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // Retorna null quando não tem ninguem na fila
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Retorna um erro quando não tem ninguem na fila
		System.out.println(fila.element());
		
		// Poll e Remove -> obter o próximo elemento 
		// da fila e remove!
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Lança uma exceção (Erro)
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.remove()); 
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty(); // Para saber se a fila está vazia
		// fila.contains(...);
		
	}
}
