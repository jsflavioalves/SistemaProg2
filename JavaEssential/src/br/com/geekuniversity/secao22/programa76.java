package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams s�o fluxos de dados ou fluxos de objetos, utilizados
// para podermos trabalhar com estes dados de forma mais criteriosa
// Como fazer para imprimir somente os cursos com mais de 50 alunos ?
public class programa76 {
/*
 Quando trabalhamos com stream, os m�todos aplicados n�o afetam a 
 cole��o original.
 */
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o para Leigos",170));  //classes an�nimas
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o",280));
		cursos.add(new Curso("Programa��o em C essential",125));
		cursos.add(new Curso("Programa��o em Java",0));
		cursos.add(new Curso("Programa��o em Phyton",90));
		cursos.add(new Curso("Banco de Dados",80));
		
		// s� � poss�vel utilizar o Lambda e method references se OverRide ToString
		// cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome())); //usando lambda
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println); //usando method references
		
	}

}
