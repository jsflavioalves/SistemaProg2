package br.com.geekuniversity.secao21;

import java.util.LinkedList;

//Conjuntos
public class programa64 {
/*
 Uma das caraceter�sticas dos conjuntos � que n�o aceita elementos
 repetidos.
 */
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("J�lia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity");
		
		conjunto.remove("J�lia");
		System.out.println(conjunto);
		
//		LinkedList<String> conjunto = new LinkedList<String>();
//		
//		System.out.println(conjunto);
//		
//		if (!conjunto.contains("Angelina")) {  //para n�o adicionar duplicado Angelina
//			conjunto.add("Angelina");
//		}
//		if (!conjunto.contains("Felicity")) {  //para n�o adicionar duplicado Felicity
//		     conjunto.add("Felicity");
//		}
//		System.out.println(conjunto);
	}

}
