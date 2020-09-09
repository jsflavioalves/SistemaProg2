package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//classes an�nimas
public class programa70 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Comparator<String> comparador = new ComparadorPorTamanho();
				
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Estudo");
		palavras.add("Avan�ado");
		palavras.add("Default");
		palavras.add("Methods");
		palavras.sort(comparador);
		
		palavras.forEach(new Consumer<String>(){
			@Override						//n�o precisa implementar ImprimeNalinha
			public void accept(String s) {
				System.out.println(s);				
			}
		});

	}

}
