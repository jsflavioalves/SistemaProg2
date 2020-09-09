package br.com.geekuniversity.secao21;

import java.util.Stack;

// Pilhas como objeto implementado pelo java
public class programa61 {

	public static void main(String[] args) {
		Stack <String> nomes = new Stack<String>();
		nomes.push("Angelina"); //nas pilhas stack é o insere
		nomes.push("Felicity");
		System.out.println(nomes);
		
		String ret = nomes.peek(); //retorna o elemento do topo
		System.out.println("O elemento do topo é "+ret);
		
		String r1 = nomes.pop(); // nas pilhas pop é o remove
		System.out.println(r1);
		System.out.println(nomes);
	}

}
