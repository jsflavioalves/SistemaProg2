package br.com.geekuniversity.secao21;
//Filas
public class programa62 {
/*
 Todo elemento entra no final da fila.
 O primeiro elemento a entrar é o primeiro a sair.
 */
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.adiciona("Angelina");
		fila.adiciona("Felicity");
		fila.adiciona("Maria");
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		
		System.out.println(fila.vazia());
	}

}
