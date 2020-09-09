package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

//listas
public class programa45 {
/*
 Vetores (arrays ou matrizes) tem tamanho fixos
 são sempre do mesmo tipo. è difícil encontrar um elemento no array
 para encontrar um valor precisa-se percorrer todos os índices do array
 */

/*
 Coleções 
 Java possui diversas classes/interfaces quando se trata de coleções de dados
 Aceitam repetição de valores e possuem tamanho infinito
 Podemos colocar valores de qualquer tipo, desde que não especificado o tipo
 na declaração
 */
	public static void main(String[] args) {
		// ArrayList nomes = new ArrayList();
		ArrayList <String> nomes = new ArrayList <String>();
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Pedro");
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4f);
		
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//			
//		}
		Collections.sort(nomes);
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
