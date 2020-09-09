package br.com.geekuniversity.secao06;
// Tipos booleanos
public class Programa14 {

	public static void main(String[] args) {
		//tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		boolean ativo = falso;
		
		//tipos não primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("verdadeiro= "+verdadeiro);
		System.out.println("falso= "+falso);
		System.out.println("v= "+v);
		System.out.println("f= "+f);

		if(ativo) {
			System.out.println("Sistema liberado para acesso");
		}
		else {
			System.out.println("Sistema não liberado");
		}
	}

}
