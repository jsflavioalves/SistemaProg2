// Heran�a e polimorfismo
package br.com.geekuniversity.secao12;

public class Programa28 {

	public static void main(String[] args) {
//		Pessoa p1 = new Pessoa ("Pedro da Silva",1987,"pedro@gmail.com");
//		// O m�todo toString � herdado da classe Object e fornece o endere�o de mem�ria da inst�ncia
//		System.out.println(p1.toString());
	//	System.out.println("Nome : "+p1.getNome());
		
		Aluno a1 = new Aluno ("Vanessa da Silva",2001,"vanessa@gmail.com","123456");
		System.out.println(a1); //toString
		System.out.println(a1.getNome());
		
		Professor prof1 = new Professor ("Augusto da Silva",1976,"augusto@gmail.com","ABC987");
		System.out.println(prof1); //toString
		System.out.println(prof1.getNome());
	}

}
