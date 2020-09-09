package br.com.geekuniversity.secao08;
import java.util.Scanner;

// função
/*
 * Faça um programa que receba diversos nomes 
 * de frutas do usuário e no final imprima essas frutas
 * em ordem contrária. O programa deve solicitar ao usuário
 * quantas frutas ele quer informar.
 * 
 * Informe quantas frutas deseja cadastrar:
 * Informe um nome de uma fruta:
 * Manga
 * Informe um nome de uma fruta:
 * Goiaba
 * 
 * Goiaba
 * Manga
 */
public class Programa20 {
	static String frutas [];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd;
		System.out.println("Informe a quantidade de frutas para cadastrar:");
		qtd = Integer.parseInt(teclado.nextLine());
    	cadastrar_dados(qtd);
    	mostrar_dados(qtd);
		teclado.close();
	}
	
    static void cadastrar_dados (int quantidade){
    	frutas = new String[quantidade];
	    for (int i = 0; i < quantidade; i++) {
		  System.out.println("Informa a "+(i+1)+" fruta:");
		  frutas[i] = teclado.nextLine();
		}
    }
    static void mostrar_dados(int quantidade) {
    	for (int j = quantidade-1; j >= 0; j--) {
  		  System.out.println(frutas[j]);
  	    }
    }
}
