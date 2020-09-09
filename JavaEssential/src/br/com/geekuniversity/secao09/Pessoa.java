package br.com.geekuniversity.secao09;
//Classes - são modelos de dados
// atributos, métodos - é a ação que é realizada por um objeto
public class Pessoa {
	String nome, email;
	int ano_nascimento;
	
	// Construtor vazio criado automaticamente
	public Pessoa() {
		
	}
	
	// Construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	// Metodo
	void ImprimeInformacoes () {
		System.out.println("Nome : "+ this.nome);
		System.out.println("Email : "+ this.email);
		System.out.println("Ano de Nascimento : "+ this.ano_nascimento);
	}
}
