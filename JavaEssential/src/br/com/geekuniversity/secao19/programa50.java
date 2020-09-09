package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Maps definido pela interface Map
public class programa50 {
/*
 Mapas representam tr�s cole��es:
 - cole��o de chaves
 - cole��o de valores
 - cole��o de associa��es
 */
	public static void main(String[] args) {
		Map <Integer,String> pessoas = new HashMap <Integer,String> ();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Cole��o de �ndices
		System.out.println("Chaves : " + pessoas.keySet());
		
		//Cole��o de valores
		System.out.println("Valores : " + pessoas.values());
		
		//Cole��o de associa��es
		System.out.println("Associa��o : " + pessoas.entrySet());
				
		// for disponibilizado a partir do Java 8
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		
		//interar na cole��o de chaves
		Set <Integer> chaves = pessoas.keySet();
		for(Integer idade : chaves) {
			System.out.println(idade);
		}
		
		//interar na cole��o de valores
		// Forma 1
		Collection <String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		// Forma 2
		pessoas.values().forEach(nome ->{
			System.out.println(nome);
		});
		
		//interar na cole��o de associa��es
		// Forma 1
		Set <Entry <Integer,String>> associacoes = pessoas.entrySet();
		for(Entry <Integer,String> associacao : associacoes ) {
			System.out.println(associacao.getKey() + " - " +associacao.getValue());
		}
		
		// Forma 2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " +associacao.getValue());
		});
	}

}
