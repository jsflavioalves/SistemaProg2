package br.com.geekuniversity.secao06;
//Opera��es matem�ticas
public class Programa15 {

	public static void main(String[] args) {
		int num1=5, num2=9, res;
		float res2;
		
		res = num1 + num2;
		System.out.println("A soma de "+num1+ " e "+num2+ " � "+res);

		res = num1 - num2;
		System.out.println("A diferen�a de "+num1+ " e "+num2+ " � "+res);
		
		res = num1 * num2;
		System.out.println("A multiplica��o de "+num1+ " e "+num2+ " � "+res);
		
		res2 = num2 / num1;
		System.out.println("A divis�o de "+num2+ " e "+num1+ " � "+res2);
		
		res2 = (float) num2 / (float) num1;
		System.out.println("A divis�o real de "+num2+ " e "+num1+ " � "+res2);
		
		res = num1 % 2;
		System.out.println("O resto da divis�o de "+num1+ " por 2 � "+res);
		
		res = num2 % 3;
		System.out.println("O n�mero "+num2+ " � divis�vel ? "+res);
	}

}
