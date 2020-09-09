package br.com.geekuniversity.secao05;
// do while
import java.util.Scanner;

public class Programa08 {
	/* 
	 * Receba dados do usuario enquanto idade for maior que 0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		String nome;
		// Para receber dados do usuário
		Scanner teclado = new Scanner(System.in);
	do {
		
		System.out.println("Informe seu nome:");
		nome = teclado.nextLine();
		System.out.println("Informe sua idade:");
		// idade = teclado.nextInt(); //bug
		idade = Integer.parseInt(teclado.nextLine());
		if(idade>0) System.out.println(nome + " tem "+idade +" anos");
		} while (idade>0);
	teclado.close();
	}

}
