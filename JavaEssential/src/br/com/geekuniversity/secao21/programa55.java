package br.com.geekuniversity.secao21;
//armazenamento sequencial
public class programa55 {
/*
 int numeros[]= new int[5];
 
 numeros[0] = 1
 numeros[1] = 3
 numeros[2] = 5
 numeros[3] = 7
 numeros[4] = 9
 */
	public static void main(String[] args) {
//		int numeros [] = new int [5];
//		numeros[4]=9;
//		for (int i = 0; i < 5; i++) {
//			System.out.println(numeros[i]);
//		}
		Aluno a1 = new Aluno("Angelina Jolie");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		System.out.println("Total de alunos antes "+ lista.tamanho());
		
		lista.adicionar(a1);
		lista.adicionar(a2);
		
		System.out.println("Total de alunos depois "+ lista.tamanho());
		System.out.println(lista);
		
		System.out.println(lista.contemaluno(a1));

		System.out.println(lista.pega(0));
		try {
			System.out.println(lista.pega(101));
		} catch (IllegalArgumentException e) {
			System.out.println("O aluno da posição 101 não existe");
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Maria");
		lista.adiciona(a3, 1);
		
		lista.remove(0);
		System.out.println(lista);
	}

}
