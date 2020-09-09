package br.com.geekuniversity.secao20;
// Threads n�o sincronizadas e n�o s�o est�veis
import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class programa53 {
/*
 Por padr�o as threads n�o s�o sincronizadas, pode ocorrer
 o problema de uma thread acessar um valor que ainda n�o for
 atualizado ou as threads executar depois que o valor for 
 impresso.
 */
	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37,"Angelina Jolie","Rua 1");
		Conta c1 = new Conta(1,200,300,cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		System.out.println(c1);
	}

}
