package br.com.geekuniversity.secao05;
//while 
import java.util.Scanner;
public class Programa07 {
/* 
 * Receba dados do usuario enquanto idade for maior que 0
 */
	public static void main(String[] args) {
		int idade=1;
		String nome;
		Scanner teclado = new Scanner(System.in);
	while (idade>0) {
		
		System.out.println("Informe seu nome:");
		nome = teclado.nextLine();
		System.out.println("Informe sua idade:");
		// idade = teclado.nextInt(); //bug
		idade = Integer.parseInt(teclado.nextLine());
		System.out.println(nome + " tem "+idade +" anos");
       }
	teclado.close();
	
	}

}
