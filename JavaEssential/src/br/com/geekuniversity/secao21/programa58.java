package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

// linked list
public class programa58 {

	public static void main(String[] args) {
		List <String> lista = new LinkedList <String>();
		
		System.out.println(lista.size());
		lista.add("Felicity");
		lista.add("Angelina");
		System.out.println(lista);
		
		lista.add(0, "Pedro");
		System.out.println(lista);
	}

}
