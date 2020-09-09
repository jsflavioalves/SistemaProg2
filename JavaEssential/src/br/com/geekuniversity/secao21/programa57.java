package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;

// Lista ligada = linked list
public class programa57 {

	/*
	 Em um vetor os elementos estão um do lado do outro,
	 enquanto numa lista ligada estão em lugares diferentes, porém um aponta
	 para o outro indicando o próximo elemento.
	 [0] [3] [1] [4] [2]
	 */
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adiciona("Angelina");
				
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adicionanoComeco("Felicity");
		System.out.println(lista);
		
		lista.adiciona(1,"Pedro");
		System.out.println(lista);
		
		Object ret = lista.pegaCelula(1);
		System.out.println(ret);
		
		lista.removedoComenco();
		System.out.println(lista);
		
//		System.out.println(lista);
//
//		lista.adicionanoComeco("Maria");
//		System.out.println(lista);
//		
//		lista.adicionanoComeco("Angelina");
//		System.out.println(lista);
//		
//        lista.adicionanoComeco("Felicity");
//		System.out.println(lista);
//		
//		int numero = 42;
//		lista.adicionanoComeco(numero);
//		System.out.println(lista);
//		
//		Cliente cli1 = new Cliente(34,"Juliana Paes","Rua XXX");
//		lista.adicionanoComeco(cli1);
//		System.out.println(lista);
	}

}
