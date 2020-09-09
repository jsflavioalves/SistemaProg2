package br.com.geekuniversity.secao15;

public class Conta {
	private int conta;
	private String cliente;
	
	public static int contador=1;
	
	public Conta() {
		
	}
	public Conta(String cliente) {
		this.conta = contador;
		this.cliente = cliente;
		Conta.contador=Conta.contador+1;		
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
			
	public static int proximaConta() {
		return Conta.contador;
	}
}
