package br.com.geekuniversity.secao14;
/*
 Uma interface pode conter:
 1) Constantes;
 2) M�todos abstratos
 */
public interface IEletronico {
	//constante MARCA tudo em mai�sculo
	// Interface para servir de contrato para produtos eletronicos.
	// Todo produto eletr�nico que implementar esta interface obrigatoriamente
	// dever�o implementar os m�todos abstratos.
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();
	
	
}
