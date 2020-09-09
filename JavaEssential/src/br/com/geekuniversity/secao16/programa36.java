package br.com.geekuniversity.secao16;
/*
 * Tratando exceções com Try/Catch
 * Utilizamos o catch para capturar o erro e oferecer ao usuário
 * uma mensagem mais elegante.
 */
public class programa36 {

	public static void main(String[] args) {
		int numeros[] = new int[5]; // 0..4
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		for (int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Passou do limite do array");
			} finally { // serve para continuar algo após o erro
				// o finally é sempre executado
				System.out.println("Continua o processo...");
			}
			
		}
	}

}
