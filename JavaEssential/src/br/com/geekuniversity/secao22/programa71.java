package br.com.geekuniversity.secao22;
//atalho do Eclipse para identação do código = CTRL + SHIFT + S
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Lambdas são funções anônimas que invocam diretamente o resultado
// do método da classe interna
public class programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Comparator<String> comparador = new ComparadorPorTamanho();
				
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avançado");
		palavras.add("Default");
		palavras.add("Methods");
		palavras.sort(comparador);
		
		//expressão lambda forma 1
//		palavras.forEach((String s) -> { // -> a seta é Lambda
//			System.out.println(s);     // O lambda infere a classe
//		});							// consumer fornecendo
							//diretamente a string do método accept
		
		//expressão lambda forma 2 - se for 1 parametro e 1 saída
		palavras.forEach((s) -> // -> a seta é Lambda
		System.out.println(s) // se tiver várias linhas de
		);					// execução tem que manter as chaves {}
									
	}

}
