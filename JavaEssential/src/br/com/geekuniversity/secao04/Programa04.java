package br.com.geekuniversity.secao04;
//if, else, else if
public class Programa04 {

	public static void main(String[] args) {
		int numero = 5;
		if(numero>5) {
          System.out.println("Sim, o n�mero "+numero+" � maior que 5");
		} else if(numero==5) {
			System.out.println("O n�mero � igual a 5");
		} else if(numero % 2==0) {
			System.out.println("O n�mero "+numero+"� par");
		} else {
		  System.out.println("N�o, o n�mero "+numero+" � menor que 5");
		}
	}

}
