package br.com.geekuniversity.secao21;

public class ListaLigada {
	private Celula primeira = null;
	private Celula ultima = null;
	private int total = 0;
	
	/** método que adiciona um objeto no começo da lista */
	public void adicionanoComeco(Object elemento) {
		if (this.total == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(elemento,this.primeira);
			this.primeira.setAnterior(nova); 
			this.primeira = nova;
		}
		this.total = this.total + 1;
	}
	
	/** método que adiciona um objeto no final da lista */
	public void adiciona(Object elemento) {
		if (this.total == 0) {
			this.adicionanoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.total = this.total + 1;
		}
	}
	
	/** método que adiciona um elemento no meio de acordo com a posicao */
	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) {
			this.adicionanoComeco(elemento);
		} else if (posicao == this.total){
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pega(posicao-1);
			Celula proxima = anterior.getProximo(); //para dupl ligada
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			nova.setAnterior(anterior); //para dupl ligada
			proxima.setAnterior(nova); //para dupl ligada
			this.total = this.total + 1;
		}
	}
	
	public Celula pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inexistente.");
		}
		Celula atual = this.primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public Object pegaCelula(int posicao) {
		return this.pega(posicao).getElemento();
	}
	
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removedoComenco();
		} else if(posicao == this.total - 1) {
			this.removedoFim();
		} else {           //se for um elemento do meio
			Celula anterior = this.pega(posicao-1);
			Celula atual = anterior.getProximo(); //este é o que vamos remover
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.total = this.total - 1;
		}
		
	}
	
	public void removedoFim() {
		if (this.total == 1) {
			this.removedoComenco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.total = this.total - 1;
		}
	}
	
	public void removedoComenco() {
		if (this.total == 0) {
			throw new IllegalArgumentException("Lista Vazia.");
		}
		this.primeira = this.primeira.getProximo();
		this.total = this.total - 1;
		
		if (this.total == 0) {
			this.ultima=null;
		}
	}
	
	public int tamanho() {
		return this.total;
	}
	
	public boolean contem(Object obj) {
		Celula atual = this.primeira;
		while (atual != null) {
			if (atual.getElemento().equals(obj)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}
	
	@Override
	public String toString() {
		if (total == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < total; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
	
	private boolean posicaoOcupada(int posicao) {
		return (posicao >= 0 && posicao <this.total);
	}
}
