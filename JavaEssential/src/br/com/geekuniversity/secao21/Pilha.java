package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();
	
	/** em uma pilha inserimos elementos no topo */
	public void insere(String nome) {
		this.nomes.add(nome);
	}
	
	/** em uma pilha removemos elementos no topo */
	public String remove() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazia() {
		return nomes.size() == 0;
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
	
	public String pegaTopo() {
		return nomes.get(nomes.size()-1);
	}
}
