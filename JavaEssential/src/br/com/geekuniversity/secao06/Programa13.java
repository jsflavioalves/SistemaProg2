package br.com.geekuniversity.secao06;
/*
 * Tipos de dados alfanuméricos - char e string
 */
public class Programa13 {

	public static void main(String[] args) {
		// Tipos primitivos
		char letra1 = 'a'; //aspas simples
		char letra2 = 98;
		// em java não tem um tipo primitivo para string
		letra2 = (char) (letra2+1); // cast
		
		System.out.println("Letra1: "+letra1);
		System.out.println("Letra2: "+letra2);
		
		// Tipos não primitivos
		Character letra3='A';
		String nome = "UFC";
		
		System.out.println("Letra3: "+letra3);
		System.out.println("Nome: "+nome);
		
		System.out.println("tamanho do Char "+Character.SIZE+" bits");
		System.out.println("valor Min do Char "+Character.MIN_VALUE);
		System.out.println("valor Max do Char "+Character.MAX_VALUE);
		
		System.out.println("tamanho da String "+(Character.SIZE)*(nome.length())+" bits");
		
	}

}
