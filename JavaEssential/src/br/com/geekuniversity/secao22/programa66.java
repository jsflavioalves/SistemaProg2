package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Default Methods - novidade a partir da vers�o 8
// S�o m�todos concretos implementados em interfaces
// Estes m�todos, como s�o concretos ou seja possuem implementa��o
// n�o precisam ser implementados nas classes filhas que implementarem
// esta interface.
public class programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avan�ado");
		palavras.add("Default");
		palavras.add("Methods");
		
		Collections.sort(palavras); //ordena alfab�tica
		System.out.println(palavras);
		
		//Collections.sort(palavras,comparador); //ordena por tamanho
		palavras.sort(comparador);
		
//		for (int i = 0; i < palavras.size(); i++) {
//			System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
//		}
		System.out.println(palavras);
		
	}

}
