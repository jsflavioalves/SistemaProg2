package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Conjuntos que são collections
public class programa48 {
/*
 * Os conjuntos são implementados pela interface Set
 * Uma das classes que implementa é a Hashset()
 * A maioria das coleções possuem os mesmos métodos e já conhecidos e já
 * utilizados com as listas, mas o comportamento é diferente.
 * Característica dos conjuntos:
 * - A ordem de inserção não é respeitada
 * - Não aceita valores repetidos e não aceita collections.sort()
 * - Não possui índices get(1);
 */
	public static void main(String[] args) {
		Set <String> nomes = new HashSet <String> ();
		Scanner teclado = new Scanner(System.in);
		boolean res;
//		nomes.add("Maria");
//		nomes.add("Angelina");
//		nomes.add("Felicity"); // conjunto não aceita repetição de valores
//		nomes.add("Pedro");
//		nomes.add("João");
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + " de 5 nomes: ");
			String nome = teclado.nextLine();
			res= nomes.add(nome);
			if(!res) {
				System.out.println("O nome não pode ser repetido");
				i--;
			}
		}
		System.out.println("No conjunto nomes temos "+nomes.size()+" elementos");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
		//System.out.println(nomes.add("Sergio"));
		// nomes.add("Pedro"); não é incluído na lista pq é repetido 
//		System.out.println(nomes.contains("Felicity"));
//		for (String nome : nomes) {
//			System.out.println(nome);
//		}
			
	}

}
