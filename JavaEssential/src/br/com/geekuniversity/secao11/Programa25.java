package br.com.geekuniversity.secao11;

public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente(23,"João da Silva", "Rua da Paz,45");
		Cliente maria = new Cliente(21,"Maria da Silva", "Rua da Paz,45");
		
		Conta conta_joao = new Conta(1,100f,200f,joao);
		Conta conta_maria = new Conta(2,300f,500f,maria);
		
		System.out.println("Saldo de João (antes do saque) "+conta_joao.getSaldo());
		System.out.println("Saldo de Maria "+conta_maria.getSaldo());
		
		conta_joao.sacar(150f);
		System.out.println("Saldo de João (depois do saque) "+conta_joao.getSaldo());
		// fiquei em 40'00
				
	}

}
