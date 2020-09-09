// Interfaces
package br.com.geekuniversity.secao14;
/*
 Interfaces s�o conhecidas como contratos.
 Uma empresa criou um contrato com regras para definir a cria��o
 de um produto ou servi�os.
 Quem implementar este contrato � obrigado a seguir as regras.
 Jo�o decidiu implementar um produto/servi�o baseado neste contrato
 Maria decidiu implementar um produto/servi�o baseado neste contrato
 Os produtos e servi�os ser�o equivalentes.
 Contrato para confec��o de um bolo:
 - O bolo precisa ser de chocolate
 - O bolo deve ter cobertura
 - O bolo deve ser recheado
 */
public class Programa33 {

	public static void main(String[] args) {
		// ctrl + shift + i debug valor vari�vel
		// f5 -> avan�a no breakpoint
		// f8 -> vai at� o final
		// f6 -> retorna o valor da fun��o logo
		// f7 -> sair das classes compiladas do java
		// pode colocar breakpoints na frente e dar f8 que ele vai
		Ventilador vent = new Ventilador();
		
		System.out.println("Marca "+vent.MARCA);
		vent.desligar(); // n�o deve imprimir a mensagem, n�o desligou porque ja
		
		vent.ligar(); // deve imprimir a mensagem
		
		vent.desligar();

	}

}
