package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Maps definido pela interface Map
public class programa50 {
/*
 Mapas representam três coleções:
 - coleção de chaves
 - coleção de valores
 - coleção de associações
 */
	public static void main(String[] args) {
		Map <Integer,String> pessoas = new HashMap <Integer,String> ();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Coleção de índices
		System.out.println("Chaves : " + pessoas.keySet());
		
		//Coleção de valores
		System.out.println("Valores : " + pessoas.values());
		
		//Coleção de associações
		System.out.println("Associação : " + pessoas.entrySet());
				
		// for disponibilizado a partir do Java 8
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		
		//interar na coleção de chaves
		Set <Integer> chaves = pessoas.keySet();
		for(Integer idade : chaves) {
			System.out.println(idade);
		}
		
		//interar na coleção de valores
		// Forma 1
		Collection <String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		// Forma 2
		pessoas.values().forEach(nome ->{
			System.out.println(nome);
		});
		
		//interar na coleção de associações
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
