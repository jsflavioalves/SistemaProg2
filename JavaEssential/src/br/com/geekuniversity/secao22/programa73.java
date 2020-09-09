package br.com.geekuniversity.secao22;
//Lambdas podemos utilizá-las com interfaces funcionais como o Consumer
//que ´só possuem um método para implementação
//Devemos criar uma função lambda compatível com a interface que estivermos
// utilizando. A interface Consumer possue um método que recebe uma string
// e não retorna nada. Por isso foi possível criar uma lambda que aceita
// um objeto (pode ser string) e não retorna nada.
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// A função sort espera receber 2 parâmetros como entrada e retorna 1 inteiro
// Por isso, foi possível passar 2 strings como entrada e retorna 1 inteiro
// na expressão lambda Integer.compare
public class programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
						
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avançado");
		palavras.add("Default");
		palavras.add("Methods");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.forEach(s -> System.out.println(s)); 
		
		//A linha 21 é equivalente as linhas seguintes
//		Consumer<String> consumer = s -> System.out.println(s);
//		palavras.forEach(consumer);
		
	}

}
