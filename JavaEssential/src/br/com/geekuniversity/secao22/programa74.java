package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//method references são simplificações das expressões lambdas
public class programa74 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avançado");
		palavras.add("Default");
		palavras.add("Methods");

		//Interface Function
		//Interface Comparator
//		Comparator<String> comparador = Comparator.comparing(new Function<String,Integer>(){
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		});
		
		//palavras.sort(comparador);
		//palavras.sort(Comparator.comparing(s -> s.length())); //expressão lambda
		
		//mesma linha utilizado method references
		//Method Reference - Forma 1
		//palavras.sort(Comparator.comparing(String::length)); //method references
		
		//Method Reference - Forma 2
		Function<String,Integer> tamanho = String :: length; 
		// Function<String,Integer> tamanho = s -> s.length(); //usando lambda faz a mesma coisa
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);		
		
		//System.out.println(palavras);
		// palavras.forEach(s -> System.out.println(s)); //lambda
		palavras.forEach(System.out::println); //method reference
		
		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
	}

}
