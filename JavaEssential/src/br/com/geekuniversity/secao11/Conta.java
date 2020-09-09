package br.com.geekuniversity.secao11;
/*
 * Métodos getters e setters
 * getters é o método público que serva para consultar dados
 * a nomenclatura é get_nomedoatributo
 */
public class Conta {
	private int numconta;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	// Construtor
	public Conta (int numconta, float saldo, float limite, Cliente cliente) {
		this.numconta = numconta;
		this.saldo = saldo + limite;
		this.limite = limite;
		this.cliente = cliente;				
	}
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}

	// Métodos
	public void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso");
		}else if (valor <= this.saldo + this.limite) {
			// calculando o valor excedente do saque
			float val_ret = this.saldo - valor;
			if (val_ret<0) {
				this.saldo=0;
			}
			val_ret = this.limite - val_ret;
			this.limite = val_ret;
			if (this.limite >=0) {
				System.out.println("Saque realizado com sucesso");	
			} else {
				System.out.println("Limite estourado");
			}
			
		}
		else {
			System.out.println("Saldo insuficiente !");
		}
	}
	
	/**
	* Método para realizar depósito da conta
	* @param valor a ser depositado
	 */
	/** Forma 1 para sincronização da Thread */
//	public void depositar(float valor) {
//		synchronized(this) { //sincronizador da thread
//			this.saldo = this.saldo + valor;
//		}
//	}
	
	/** Forma 2 para sincronização da Thread */
	public synchronized void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	/**Método getter do atributo saldo - retorna a 
	 soma do saldo + limite */
	public float getSaldo() {
		return this.saldo;
	}
	
	public float getLimite() {
		return this.limite;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta é " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Conta) {
			return false;			
		} else {
			Conta verificar = (Conta) obj; //cast
			return verificar.getSaldo() == this.getSaldo();
		}
		
	}
}
