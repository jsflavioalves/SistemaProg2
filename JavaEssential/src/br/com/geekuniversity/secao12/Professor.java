package br.com.geekuniversity.secao12;

public class Professor extends Pessoa {
         private String matricula;
	
	public Professor (String nome, int ano_nascimento, String email, String matricula) {
		super(nome, ano_nascimento, email);
		this.matricula=matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
    public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
    
    //reimplementa��o do m�todo getNome - objetos do mesmo tipo podem agir de forma diferente
    //exemplo de override
    public String getNome() {
    	return "Professor :" + super.getNome();
    }
    
    public String toString() {
    	// Poliformismo pega os m�todos da m�e pessoa e acrescenta o RA
		return super.toString() + "\nMatricula = " + this.matricula;
	}

	@Override
	public void Outramensagem(String texto) {
		System.out.println(texto);
		
	}
}
