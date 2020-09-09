package br.com.geekuniversity.secao22;
/*
 Criando o nosso pr�prio comparador de Strings para que seja
 poss�vel ordenar por tamanho de String ao inv�s de ordem alfab�tica
 
 1 - A string1 � menor que a string2  ===> retorna -1
 2 - A string1 � maior que a string2  ===> retorna 1
 3 - A string1 tem o mesmo tamanho da string2 ===> retorna 0
 */
import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String>{
// modifica a Collection.sort
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

	
}
