package br.com.geekuniversity.secao07;
//Vetores parte 2
public class Programa17 {

	public static void main(String[] args) {
		int numeros[]= new int[10];
		
		System.out.println("tamanho do vetor: " + numeros.length);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= i + 3;
		}
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= (int)Math.round(Math.random())*10;
		}
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		System.out.println(Math.random()); // gera um double entre 0 e 1
		
		for (int i : numeros) {  //foreach
			System.out.println(i);
		}
	}

}
