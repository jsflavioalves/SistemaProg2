package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

//listas
public class programa45 {
/*
 Vetores (arrays ou matrizes) tem tamanho fixos
 s�o sempre do mesmo tipo. � dif�cil encontrar um elemento no array
 para encontrar um valor precisa-se percorrer todos os �ndices do array
 */

/*
 Cole��es 
 Java possui diversas classes/interfaces quando se trata de cole��es de dados
 Aceitam repeti��o de valores e possuem tamanho infinito
 Podemos colocar valores de qualquer tipo, desde que n�o especificado o tipo
 na declara��o
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
