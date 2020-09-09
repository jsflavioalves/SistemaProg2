package br.com.geekuniversity.secao12;
/*
 * Herança - evita a repetição de código e facilita a manutenção
 */
public class Aluno extends Pessoa { //aluno é uma pessoa, ganha todos os atributos e métodos
	private String RA;
	
	public Aluno (String nome, int ano_nascimento, String email, String RA) {
		super(nome, ano_nascimento, email);
		this.RA=RA;
	}
	
	public String getRA() {
		return this.RA;
	}
	
    public void setRA(String RA) {
		this.RA=RA;
	}
    
    //exemplo de override
    public String getNome() {
    	return "Aluno :" + super.getNome();
    }
    
    public String toString() {
    	// Poliformismo pega os métodos da mãe pessoa e acrescenta o RA
		return super.toString() + "\nRA = " + this.RA;
	}

	@Override
	public void Outramensagem(String texto) {
		System.out.println(texto);
		
	}
}
