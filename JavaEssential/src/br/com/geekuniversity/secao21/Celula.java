package br.com.geekuniversity.secao21;
/** Classe que representa uma c?lula ou um container 
 onde teremos um objeto, valor e uma c?lula que ser? a liga??o para 
 o pr?ximo */
public class Celula {
	private Object elemento;
	private Celula proximo;
	private Celula anterior;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento=elemento;
		this.proximo=proximo;
	}

	public Celula(Object elemento) {
		this(elemento,null);
	}
	
	public Celula getProximo() {
		return this.proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return this.elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	
	
	
	
}
