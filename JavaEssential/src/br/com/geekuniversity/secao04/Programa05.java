package br.com.geekuniversity.secao04;
// Operador Tern�rio
public class Programa05 {
	// digite a palavra main e ctrl + barra espa�o inclui a fun��o main
    public static void main(String[] args) {
		int valor=100,numero; 
		/* if(valor>0) {
			numero=valor;
		} else {
			numero=7;
		} */
		//operador tern�rio
		numero = (valor>0) ? valor : 7;
		System.out.println(numero);
	}
}
