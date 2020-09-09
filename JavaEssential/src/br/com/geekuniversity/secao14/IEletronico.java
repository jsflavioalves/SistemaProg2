package br.com.geekuniversity.secao14;
/*
 Uma interface pode conter:
 1) Constantes;
 2) Métodos abstratos
 */
public interface IEletronico {
	//constante MARCA tudo em maiúsculo
	// Interface para servir de contrato para produtos eletronicos.
	// Todo produto eletrônico que implementar esta interface obrigatoriamente
	// deverão implementar os métodos abstratos.
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();
	
	
}
