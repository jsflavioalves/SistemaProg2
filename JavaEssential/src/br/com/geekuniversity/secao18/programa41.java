package br.com.geekuniversity.secao18;
// trabalhando com strings
/*
 Em java as strings são imutáveis
 */
public class programa41 {

	public static void main(String[] args) {
		String curso = "Programação em Java Essencial";
		
//		curso = curso.toUpperCase(); // Converte as letras minusculas para maisculas
//		curso = curso.replace("Java", "Phyton");
//		String nova = curso.replace("a", "o");
//		
//		System.out.println(curso);
//		System.out.println(nova);
//		
//		System.out.println(curso.charAt(0));
		
//		for (int i = 0; i < curso.length(); i++) {
//			System.out.println(curso.charAt(i));
//		}
		
		for (int i = curso.length()-1; i >=0 ; i--) {
			System.out.print(curso.charAt(i));
		}
	}

}
