package br.com.geekuniversity.secao12;
// toda classe herda da classe Object par�metros e m�todos

// agora como classe abstrata
// geralmente as classes abstratas s�o classes bases
// uma classe abstrata possue par�metros, m�todos e m�todos abstratos
// m�todos abstratos n�o possuem implementa��o
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
		System.out.println("Esta � minha mensagem");
	}
	//Overload
	public void Mensagem(String msg) {
		System.out.println(msg);
	}
	
	// declara��o de um m�todo abstrato
	public abstract void Outramensagem(String texto);
}
