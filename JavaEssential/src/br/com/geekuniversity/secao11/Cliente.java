package br.com.geekuniversity.secao11;
/*
 * Protected (modificador de acesso padrão) - faz com que o elemento seja visível 
 * somente no mesmo pacote em que ele foi declarado.
 */
public class Cliente implements Comparable{
	private int idade;
	private String nome;
	private String endereco;
	
	// Construtor
	public Cliente(int idade,String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		// this.dizerOi();
	}
	
//	private void dizerOi() {
//		System.out.println(this.nome + " está dizendo OI");
//	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente) outro;
		if (this.idade < aux.idade) {
			return -1;
		} else if (this.idade > aux.idade) {
			return 1;
		} else {
			return 0;
		}
	}
}
