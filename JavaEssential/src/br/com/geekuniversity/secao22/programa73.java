package br.com.geekuniversity.secao22;
//Lambdas podemos utiliz�-las com interfaces funcionais como o Consumer
//que �s� possuem um m�todo para implementa��o
//Devemos criar uma fun��o lambda compat�vel com a interface que estivermos
// utilizando. A interface Consumer possue um m�todo que recebe uma string
// e n�o retorna nada. Por isso foi poss�vel criar uma lambda que aceita
// um objeto (pode ser string) e n�o retorna nada.
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// A fun��o sort espera receber 2 par�metros como entrada e retorna 1 inteiro
// Por isso, foi poss�vel passar 2 strings como entrada e retorna 1 inteiro
// na express�o lambda Integer.compare
public class programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
						
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avan�ado");
		palavras.add("Default");
		palavras.add("Methods");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.forEach(s -> System.out.println(s)); 
		
		//A linha 21 � equivalente as linhas seguintes
//		Consumer<String> consumer = s -> System.out.println(s);
//		palavras.forEach(consumer);
		
	}

}
