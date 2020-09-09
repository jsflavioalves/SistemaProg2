package br.com.geekuniversity.secao22;
//atalho do Eclipse para identa��o do c�digo = CTRL + SHIFT + S
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Lambdas s�o fun��es an�nimas que invocam diretamente o resultado
// do m�todo da classe interna
public class programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Comparator<String> comparador = new ComparadorPorTamanho();
				
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avan�ado");
		palavras.add("Default");
		palavras.add("Methods");
		palavras.sort(comparador);
		
		//express�o lambda forma 1
//		palavras.forEach((String s) -> { // -> a seta � Lambda
//			System.out.println(s);     // O lambda infere a classe
//		});							// consumer fornecendo
							//diretamente a string do m�todo accept
		
		//express�o lambda forma 2 - se for 1 parametro e 1 sa�da
		palavras.forEach((s) -> // -> a seta � Lambda
		System.out.println(s) // se tiver v�rias linhas de
		);					// execu��o tem que manter as chaves {}
									
	}

}
