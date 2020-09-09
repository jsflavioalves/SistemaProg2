/*
 * Classes abstratas é um recurso que proporciona um
 * bloqueio na criação de objetos
 */
package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;

public class Programa31 {

	public static void main(String[] args) {
		// não conseguimos instanciar objetos de uma classe abstrata
//		Pessoa Maria = new Pessoa("Maria da Silva",1999,"maria@gmail.com");
//		System.out.println(Maria);
		Aluno Maria = new Aluno("Maria da Silva",1999,"maria@gmail.com","34567");
		System.out.println(Maria);
		Maria.Outramensagem("Meu nome é diferente");
	}

}
