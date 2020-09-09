package br.com.geekuniversity.secao05;
// foreach
public class Programa10 {

	public static void main(String[] args) {
		String nome = "Geek University";
		// imprime cada um dos caracteres da string nome
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
		}
	}

}
