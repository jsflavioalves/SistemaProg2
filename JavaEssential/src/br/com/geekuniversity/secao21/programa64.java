package br.com.geekuniversity.secao21;

import java.util.LinkedList;

//Conjuntos
public class programa64 {
/*
 Uma das caraceterísticas dos conjuntos é que não aceita elementos
 repetidos.
 */
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity");
		
		conjunto.remove("Júlia");
		System.out.println(conjunto);
		
//		LinkedList<String> conjunto = new LinkedList<String>();
//		
//		System.out.println(conjunto);
//		
//		if (!conjunto.contains("Angelina")) {  //para não adicionar duplicado Angelina
//			conjunto.add("Angelina");
//		}
//		if (!conjunto.contains("Felicity")) {  //para não adicionar duplicado Felicity
//		     conjunto.add("Felicity");
//		}
//		System.out.println(conjunto);
	}

}
