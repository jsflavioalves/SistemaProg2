package br.com.geekuniversity.secao06;
//Operações matemáticas
public class Programa15 {

	public static void main(String[] args) {
		int num1=5, num2=9, res;
		float res2;
		
		res = num1 + num2;
		System.out.println("A soma de "+num1+ " e "+num2+ " é "+res);

		res = num1 - num2;
		System.out.println("A diferença de "+num1+ " e "+num2+ " é "+res);
		
		res = num1 * num2;
		System.out.println("A multiplicação de "+num1+ " e "+num2+ " é "+res);
		
		res2 = num2 / num1;
		System.out.println("A divisão de "+num2+ " e "+num1+ " é "+res2);
		
		res2 = (float) num2 / (float) num1;
		System.out.println("A divisão real de "+num2+ " e "+num1+ " é "+res2);
		
		res = num1 % 2;
		System.out.println("O resto da divisão de "+num1+ " por 2 é "+res);
		
		res = num2 % 3;
		System.out.println("O número "+num2+ " é divisível ? "+res);
	}

}
