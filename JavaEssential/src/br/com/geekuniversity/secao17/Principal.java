package br.com.geekuniversity.secao17;

import java.util.Scanner;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 * Gerando Executáveis *.jar = JAVA ARQUIVE
 * É um arquivo compactado JAVA
 * Botão direito -> exportar -> Jar file
 * Para executar na linha de comando:
 * java -jar geek.jar
 * colocando /** vai para a documentação o comentário
 */
public class Principal {

	static Cliente cli1 = new Cliente(38,"Angelina da Paz","Rua 45");
	static Conta conta = new Conta(1,100,300,cli1);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println("---- Depósito -----");
		System.out.println("Informe o valor para o depósito:");
		float valor = teclado.nextFloat();
		if(valor>0) {
			conta.depositar(valor);
			System.out.println("Depositado efetuado com sucesso "+valor);
		} else {
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	public static void sacar() {
		System.out.println("---- Saque -----");
		System.out.println("Informe o valor para saque:");
		float valor = teclado.nextFloat();
		if(valor>0) {
			conta.sacar(valor);
			//System.out.println("Saque efetuado com sucesso ");
		} else {
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	public static void consultar() {
		System.out.println("Seu saldo é : " + conta.getSaldo());
	}
	
	public static void main(String[] args) {
		int opcao=0;
		System.out.println("Bem vindo ao Banco Geek");
		do {
			System.out.println("Selecione a opcao abaixo");
			System.out.println("1 - depositar");
			System.out.println("2 - sacar");
			System.out.println("3 - Consultar saldo");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				depositar();
				break;

			case 2:
				sacar();
				break;
				
			case 3:
				consultar();
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao>0);
		teclado.close();
	}

}
