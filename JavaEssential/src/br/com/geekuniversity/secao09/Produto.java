package br.com.geekuniversity.secao09;
// Classes
public class Produto {
	// atributos ou estados da classe
	// podemos entender tamb�m que os m�todos s�o comportamentos da classe
	// Requisitos do m�todos=tipo de retorno - ex:void=vazio
	// nome do m�todo, argumentos de entrada e retorno
	String nome;
	float preco;
	float desconto;
	
	// m�todo aumentar preco em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
