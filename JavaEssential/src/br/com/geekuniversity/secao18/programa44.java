package br.com.geekuniversity.secao18;
// escrita em arquivos que cria 1 vez e acrescenta linhas
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class programa44 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			// acrescenta linhas no final do arquivo saida.txt
			// se não existir ele cria o arquivo
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt",true));
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
