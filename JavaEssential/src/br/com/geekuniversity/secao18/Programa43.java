package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//lendo arquivos
public class Programa43 {

	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(new FileInputStream("saida.txt"));
			while (ler.hasNextLine()) {
				String linha = ler.nextLine();
				System.out.println(linha);
			}
			ler.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n?o encontrado");
		}

	}

}
