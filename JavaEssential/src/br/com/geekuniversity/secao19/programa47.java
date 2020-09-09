package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.geekuniversity.secao11.Cliente;

// Lista parte 3
public class programa47 {

	public static void main(String[] args) {
		List <Cliente> clientes = new <Cliente> ArrayList(); 

		Cliente cli1 = new Cliente(43,"Maria da Silva", "Rua 1");
		Cliente cli2 = new Cliente(12,"Felicity Jones", "Rua 2");
		Cliente cli3 = new Cliente(45,"Angelia Jolie", "Rua 3");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes); // está ordenando pela idade pq a classe
		                           // clientes foi implementado o método
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
