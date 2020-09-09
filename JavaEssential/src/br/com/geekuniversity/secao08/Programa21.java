package br.com.geekuniversity.secao08;
// funções parte 2
public class Programa21 {

	public static void main(String[] args) {
		int valor1=6, valor2=4, res;
		res = soma(valor1,valor2);
		System.out.println(mensagem());
		System.out.println("O resultado da soma é "+res);
	}
	// função soma
	  static int soma(int v1, int v2) {
		  return (v1+v2);
	  }
	  
	  static String mensagem() {
		  return "Olá usuário";
	  }
}
