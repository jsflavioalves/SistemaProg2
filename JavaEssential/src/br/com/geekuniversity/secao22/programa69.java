package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes anônimas são classes que são definidas no corpo do programa
// sem necessidade de implementar uma nova classe
// Utilizamos classes anônimas quando temos interfaces com um ou
// pouco métodos e não precisaremos reaproveitar o código da classe
public class programa69 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Comparator<String> comparador = new ComparadorPorTamanho();
				
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avançado");
		palavras.add("Default");
		palavras.add("Methods");
		palavras.sort(comparador);
		
		//classe anônima
		Consumer<String> consumidor = new Consumer<String>() { //classe anônima
			@Override						//não precisa implementar ImprimeNalinha
			public void accept(String s) {
				System.out.println(s);				
			}
		};
		
		palavras.forEach(consumidor); 
		
	}

}
