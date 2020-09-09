package br.com.geekuniversity.secao21;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>> ();
/*
 Nossa lista [0] vai ser todos nomes da letra a
 Nossa lista [1] vai ser todos nomes da letra b
 ....
 Nossa lista [25] vai ser todos nomes da letra z	
 */
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26; // % � o m�dulo = resto da divis�o
	}
	
	public void adiciona(String nome) {
		if (!contem(nome)) {     //verifica se o nome j� n�o existe
			int indice = calculaIndice(nome);
			List<String> lista = tabela.get(indice);
			lista.add(nome);
		}
	}
	
	private boolean contem(String nome) {
		int indice = calculaIndice(nome);
		return tabela.get(indice).contains(nome);
	}
	
	public void remove(String nome) {
		if (contem(nome)) {
			int indice = calculaIndice(nome);
			List<String> lista = tabela.get(indice);
			lista.remove(nome);
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
	
}
