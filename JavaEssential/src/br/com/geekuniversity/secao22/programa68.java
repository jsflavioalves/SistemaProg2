package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class programa68 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avançado");
		palavras.add("Default");
		palavras.add("Methods");

		palavras.forEach(consumidor); //utiliza a interface consumidor
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
	}

}
