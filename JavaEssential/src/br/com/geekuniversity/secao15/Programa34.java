// Atributos est�ticos
package br.com.geekuniversity.secao15;

/*
 Atributos est�ticos s�o atributos, onde os valores s�o compartilhados
 entre as inst�ncias da classe
 Para utilizar um atributo est�tico, utilizamos o nome da classe 
 Conta.atributo 
 */
public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina Diniz");
		
		System.out.println(c1.getConta());
		System.out.println(c1.getCliente());
		
        Conta c2 = new Conta("Pedro Ferraz");
		
		System.out.println(c2.getConta());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Adriano louraz");
			
		System.out.println(c3.getConta());
		System.out.println(c3.getCliente());

		System.out.println(c1.contador);
		System.out.println(c2.contador);
		System.out.println(c1.contador);
		System.out.println(Conta.contador);
		
		Conta.contador = 42;
	}

}
