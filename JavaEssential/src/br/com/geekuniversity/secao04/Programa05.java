package br.com.geekuniversity.secao04;
// Operador Ternário
public class Programa05 {
	// digite a palavra main e ctrl + barra espaço inclui a função main
    public static void main(String[] args) {
		int valor=100,numero; 
		/* if(valor>0) {
			numero=valor;
		} else {
			numero=7;
		} */
		//operador ternário
		numero = (valor>0) ? valor : 7;
		System.out.println(numero);
	}
}
