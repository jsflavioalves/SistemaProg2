package br.com.geekuniversity.secao04;
// Instru��o Switch
public class Programa06 {
    public static void main(String[] args) {
	    int numero=15;
	    switch (numero) {
		case 1:
			System.out.println("O n�mero � 1");
			break;
		case 3:
			System.out.println("O n�mero � 3");
			break;
		case 5:
			System.out.println("O n�mero � 5");
			break;
		default:
			System.out.println("O n�mero � "+numero);
			break;
		}
	}
}
