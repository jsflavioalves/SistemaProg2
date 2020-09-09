// Interfaces
package br.com.geekuniversity.secao14;
/*
 Interfaces são conhecidas como contratos.
 Uma empresa criou um contrato com regras para definir a criação
 de um produto ou serviços.
 Quem implementar este contrato é obrigado a seguir as regras.
 João decidiu implementar um produto/serviço baseado neste contrato
 Maria decidiu implementar um produto/serviço baseado neste contrato
 Os produtos e serviços serão equivalentes.
 Contrato para confecção de um bolo:
 - O bolo precisa ser de chocolate
 - O bolo deve ter cobertura
 - O bolo deve ser recheado
 */
public class Programa33 {

	public static void main(String[] args) {
		// ctrl + shift + i debug valor variável
		// f5 -> avança no breakpoint
		// f8 -> vai até o final
		// f6 -> retorna o valor da função logo
		// f7 -> sair das classes compiladas do java
		// pode colocar breakpoints na frente e dar f8 que ele vai
		Ventilador vent = new Ventilador();
		
		System.out.println("Marca "+vent.MARCA);
		vent.desligar(); // não deve imprimir a mensagem, não desligou porque ja
		
		vent.ligar(); // deve imprimir a mensagem
		
		vent.desligar();

	}

}
