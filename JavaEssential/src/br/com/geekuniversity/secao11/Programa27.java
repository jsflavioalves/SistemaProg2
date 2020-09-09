package br.com.geekuniversity.secao11;

public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(43,"Felicity Jones","Rua Qualquer,123");
		
		System.out.println("Nome : "+cli1.getNome());
		System.out.println("Endereço : "+cli1.getEndereco());
		
		Cliente cli2 = new Cliente(34,"Jamily Alves","Rua Whosevelt,12");
		System.out.println("Nome : "+cli2.getNome());
		System.out.println("Endereço : "+cli2.getEndereco());
	}

}
