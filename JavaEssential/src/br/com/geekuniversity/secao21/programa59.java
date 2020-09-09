package br.com.geekuniversity.secao21;
// listas duplamente ligadas
public class programa59 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adiciona("Angelina");
				
		lista.adiciona("Maria");
		System.out.println(lista);
		
		//lista.removedoFim();
		//System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.contem("Angelina"));
	}

}
