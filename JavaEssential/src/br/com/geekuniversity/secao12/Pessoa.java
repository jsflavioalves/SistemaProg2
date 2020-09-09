package br.com.geekuniversity.secao12;
// toda classe herda da classe Object parâmetros e métodos

// agora como classe abstrata
// geralmente as classes abstratas são classes bases
// uma classe abstrata possue parâmetros, métodos e métodos abstratos
// métodos abstratos não possuem implementação
public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {
		
	}
	// Construtor
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno_Nascimento() {
		return this.ano_nascimento;
	}
	
	public void setAno_Nascimento(int anonascimento) {
		this.ano_nascimento = anonascimento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// para comentar rapidamente CTRL + SHIFT + C
	//Exemplo de overiding ou sobrescrita
	public String toString() {
		return "Nome : " + this.nome + "\n" + "Data de Nascimento : " + this.ano_nascimento;
	}
	
	//Overload
	public void Mensagem() {
		System.out.println("Esta é minha mensagem");
	}
	//Overload
	public void Mensagem(String msg) {
		System.out.println(msg);
	}
	
	// declaração de um método abstrato
	public abstract void Outramensagem(String texto);
}
