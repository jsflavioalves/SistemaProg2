package br.com.geekuniversity.secao22;

public interface Teste {
	int valor = 9;
	
	public String mensagem();
	
	default void meu_metodo() {  //na interface pode-se implementar com default
		System.out.println("Meu default method ...");
	}
}

