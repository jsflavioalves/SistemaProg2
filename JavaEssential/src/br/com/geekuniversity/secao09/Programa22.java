package br.com.geekuniversity.secao09;
// Objetos s�o as inst�ncias da classe
public class Programa22 {

	public static void main(String[] args) {
		int numero=4;
		
		//declara��o de um produto
		Produto p0;
		//declara��o e instancia��o/inicializa��o do objeto
		// p1 = objeto da classe produto ou inst�ncia
		Produto p1 = new Produto(); //construtor
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("-------Produtos -------");
		System.out.println(p1.nome);
		System.out.println("R$ "+p1.preco);
		System.out.println(p1.desconto + " %");
		
		p0 = new Produto(); //construtor
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5.0f;
		
		System.out.println(p0.nome);
		System.out.println("R$ "+p0.preco);
		System.out.println(p0.desconto + " %");
		System.out.print("\n");
		
		Pessoa pessoa1 = new Pessoa(); //construtor
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1976;
		

		System.out.println("-------Pessoas -------");
		System.out.println("Nome: "+ pessoa1.nome);
		System.out.println("Email: "+ pessoa1.email);
		System.out.println("Ano de Nascimento: "+ pessoa1.ano_nascimento);
	}

}
