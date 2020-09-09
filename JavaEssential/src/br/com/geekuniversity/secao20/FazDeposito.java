package br.com.geekuniversity.secao20;
//Threads syncronized
import br.com.geekuniversity.secao11.Conta;

public class FazDeposito implements Runnable{
	private Conta conta;

	public FazDeposito(Conta conta) {
		this.conta = conta;
		// this.conta.depositar(100.0f);
	}

	@Override
	public void run() {
		this.conta.depositar(100.0f);
		
	}
	
	
}
