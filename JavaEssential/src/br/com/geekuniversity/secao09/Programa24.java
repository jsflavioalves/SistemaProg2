package br.com.geekuniversity.secao09;
/* Construtor é um metodo especial que serve para construir o objeto
 * Podemos ter mais do que um construtor
 * Por padrão a Java Virtual Machine construi um construtor com
 * o mesmo nome da classe vazio que não recebe nenhum parametro
 */
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // Construtor 
		
		pessoa1.nome = "Felicity";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		pessoa1.ImprimeInformacoes();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie","jolie@gmail.com",1976);
		pessoa2.ImprimeInformacoes();
		
	}

}
