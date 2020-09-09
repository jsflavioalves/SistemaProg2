package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Revis�o de classes an�nimas, lambdas e methods references
public class programa75 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o para Leigos",170));  //classes an�nimas
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o",280));
		cursos.add(new Curso("Programa��o em C essential",125));
		cursos.add(new Curso("Programa��o em Java",0));
		cursos.add(new Curso("Programa��o em Phyton",90));
		cursos.add(new Curso("Banco de Dados",80));
				
		// cursos.sort(Comparator.comparing(c -> c.getAlunos()));  Lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //method references
		
		// cursos.forEach(c -> System.out.println(c.getNome()));
		cursos.forEach(System.out::println);  //method references
	}

}
