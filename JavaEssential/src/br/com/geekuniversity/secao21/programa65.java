package br.com.geekuniversity.secao21;

import java.util.HashSet;
import java.util.Set;

//Conjuntos do Java
public class programa65 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Angelina");
		nomes.add("Felicity");
		nomes.add("Ana");
		System.out.println(nomes);
		
		String nome1 = "Angelina";
		String nome2 = "Ana";
		String nome3 = "Gabriela";
		
		System.out.println(nome1.hashCode());
		System.out.println("Angelina".hashCode());
	}

}
