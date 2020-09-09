package br.com.geekuniversity.secao09;
// Classes
public class Produto {
	// atributos ou estados da classe
	// podemos entender também que os métodos são comportamentos da classe
	// Requisitos do métodos=tipo de retorno - ex:void=vazio
	// nome do método, argumentos de entrada e retorno
	String nome;
	float preco;
	float desconto;
	
	// método aumentar preco em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
