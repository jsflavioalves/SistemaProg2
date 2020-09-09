package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 Object = a mãe de todas as classes
 A classe Object faz parte do pacote java.lang
 
 */
public class programa39 {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente(18,"Angelian Jolie", "RUA 1234");
		Cliente cli2 = new Cliente(19,"Felicity Jones", "RUA 2");
		
		Conta c1 = new Conta(1,200,300,cli1);
		Conta c2 = new Conta(2,200,300,cli2);
		Caixa prateleira = new Caixa();
		
		System.out.println(c1); // por padrão a instância imprime toString
		System.out.println(c2);
		
		if (c1.equals(c2)) {
			System.out.println("São as mesmas contas.");
		} else {
			System.out.println("São contas diferentes");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		// Conta conta = prateleira.pegar(0);
		// faz um cast dos objetos informando que o objeto é do tipo conta
		System.out.println(((Conta) prateleira.pegar(0)).getSaldo());
		
		prateleira.adicionar(cli1);
		// faz um cast dos objetos informando que o objeto é do tipo cliente
		System.out.println(((Cliente) prateleira.pegar(2)).getNome());
		
		if (((Object) cli1) instanceof Conta) {
			System.out.println("O objeto é do tipo Conta");
		} else {
			System.out.println("O objeto naõ é do tipo Conta");
		}
	}

}
