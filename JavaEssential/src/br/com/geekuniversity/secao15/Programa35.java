package br.com.geekuniversity.secao15;
/*
 * Um método static não depende de uma estância da classe
 * para ser utilizado. Pode ser utilizado como nomedaclasse.metodo
 * Não depende de uma estância da classe para utilizar um método static
 */
public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Meu Cliente");
		System.out.println("Conta : " + c1.getConta());
		System.out.println("Cliente : " + c1.getCliente());
		System.out.println("A próxima conta será " + Conta.proximaConta());

	}

}
