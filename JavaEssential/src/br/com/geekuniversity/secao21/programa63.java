package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

//Fila do tipo java
public class programa63 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		System.out.println(fila);
		fila.add("Angelina");
		fila.add("Felicity");
		fila.add("Maria");
		
		System.out.println(fila);
		
		String ret = fila.poll(); //remove da fila
		System.out.println(ret);
		System.out.println(fila);
	}

}
