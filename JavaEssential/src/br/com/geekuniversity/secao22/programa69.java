package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes an�nimas s�o classes que s�o definidas no corpo do programa
// sem necessidade de implementar uma nova classe
// Utilizamos classes an�nimas quando temos interfaces com um ou
// pouco m�todos e n�o precisaremos reaproveitar o c�digo da classe
public class programa69 {

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
		
		//classe an�nima
		Consumer<String> consumidor = new Consumer<String>() { //classe an�nima
			@Override						//n�o precisa implementar ImprimeNalinha
			public void accept(String s) {
				System.out.println(s);				
			}
		};
		
		palavras.forEach(consumidor); 
		
	}

}
