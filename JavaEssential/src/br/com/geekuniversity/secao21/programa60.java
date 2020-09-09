package br.com.geekuniversity.secao21;
// Pilhas

public class programa60 {
/*
 * Pilhas são estruturas de dados onde o elemento que está visível
 * disponível é o que está sempre no ponto.
 * Os elementos ao serem adicionados numa pilha são sempre adicionados
 * no topo. O ctrlZ é exemplo de pilha.
 * Para remover, tiramos os elementos do topo.
 * O primeiro elemento a entrar é o último a sair.
 */
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println(pilha);
		pilha.insere("Angelina");
		pilha.insere("Felicity");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println("O topo é " + ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
	}

}
