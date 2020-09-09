package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Conjuntos que s�o collections
public class programa48 {
/*
 * Os conjuntos s�o implementados pela interface Set
 * Uma das classes que implementa � a Hashset()
 * A maioria das cole��es possuem os mesmos m�todos e j� conhecidos e j�
 * utilizados com as listas, mas o comportamento � diferente.
 * Caracter�stica dos conjuntos:
 * - A ordem de inser��o n�o � respeitada
 * - N�o aceita valores repetidos e n�o aceita collections.sort()
 * - N�o possui �ndices get(1);
 */
	public static void main(String[] args) {
		Set <String> nomes = new HashSet <String> ();
		Scanner teclado = new Scanner(System.in);
		boolean res;
//		nomes.add("Maria");
//		nomes.add("Angelina");
//		nomes.add("Felicity"); // conjunto n�o aceita repeti��o de valores
//		nomes.add("Pedro");
//		nomes.add("Jo�o");
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + " de 5 nomes: ");
			String nome = teclado.nextLine();
			res= nomes.add(nome);
			if(!res) {
				System.out.println("O nome n�o pode ser repetido");
				i--;
			}
		}
		System.out.println("No conjunto nomes temos "+nomes.size()+" elementos");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
		//System.out.println(nomes.add("Sergio"));
		// nomes.add("Pedro"); n�o � inclu�do na lista pq � repetido 
//		System.out.println(nomes.contains("Felicity"));
//		for (String nome : nomes) {
//			System.out.println(nome);
//		}
			
	}

}
