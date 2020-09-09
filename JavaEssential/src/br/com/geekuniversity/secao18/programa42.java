package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// escrevendo em arquivos
public class programa42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
						
		try {
			// desta forma toda vez o arquivo será criado e zera o anterior
			PrintStream escrever = new PrintStream("saida.txt");
			for (int i = 1; i <= 5; i++) {
				System.out.println("Escreva algo:");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("Não possível criar o arquivo");
		}
		
		teclado.close();
		
	}

}
