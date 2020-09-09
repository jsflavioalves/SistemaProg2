package br.com.geekuniversity.secao01;

import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente(18,"Angelina Jolie","Rua da Barra, 256");

		System.out.println(cli.hashCode());
		// System.out.println("Nome :"+ cli.nome); //agora são private
		// System.out.println("Endereço :" + cli.endereco);
	}

}
