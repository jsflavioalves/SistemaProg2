package br.com.geekuniversity.secao22;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;

//Lambdas
public class programa72 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		//Comparator<String> comparador = new ComparadorPorTamanho();
				
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avançado");
		palavras.add("Default");
		palavras.add("Methods");
		
		//Forma 1
//		palavras.sort((s1,s2) -> {       //lambda substitui classe ComparadorPorTamanho
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
			
		palavras.forEach(s -> System.out.println(s)); //1 parâmetro e 1 statement

	}

}
