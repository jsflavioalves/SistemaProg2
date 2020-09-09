package br.com.geekuniversity.secao21;
// Pilhas

public class programa60 {
/*
 * Pilhas s�o estruturas de dados onde o elemento que est� vis�vel
 * dispon�vel � o que est� sempre no ponto.
 * Os elementos ao serem adicionados numa pilha s�o sempre adicionados
 * no topo. O ctrlZ � exemplo de pilha.
 * Para remover, tiramos os elementos do topo.
 * O primeiro elemento a entrar � o �ltimo a sair.
 */
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println(pilha);
		pilha.insere("Angelina");
		pilha.insere("Felicity");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println("O topo � " + ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
	}

}
