package br.com.geekuniversity.secao06;
// Tipos de dados
// Numéricos (inteiros e reais)

public class Programa11 {

	public static void main(String[] args) {
		//Tipos primários
		long num7 = 99999;
		int num1=4;
		short num2=4;
		byte num5=7;
		char num9 = 3;
		
		//Tipos não primários são classes que representam os tipos primários
		Long num8 =  (long) 100000;
		Integer num3=98;
		Short num4=12;
		Byte num6=9;
		Character num10 = 7;
		
		System.out.println("tamanho do Long "+Long.SIZE+" bits");
		System.out.println("tamanho do Integer "+Integer.SIZE+" bits");
		System.out.println("tamanho do Short "+Short.SIZE+" bits");
		System.out.println("tamanho do Byte "+Byte.SIZE+" bits");
		System.out.println("tamanho do Char "+Character.SIZE+" bits");

	}

}
