package br.com.geekuniversity.secao15;
/*
 * Um m�todo static n�o depende de uma est�ncia da classe
 * para ser utilizado. Pode ser utilizado como nomedaclasse.metodo
 * N�o depende de uma est�ncia da classe para utilizar um m�todo static
 */
public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Meu Cliente");
		System.out.println("Conta : " + c1.getConta());
		System.out.println("Cliente : " + c1.getCliente());
		System.out.println("A pr�xima conta ser� " + Conta.proximaConta());

	}

}
