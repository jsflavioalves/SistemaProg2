package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams parte 2
public class programa77 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o para Leigos",170));  //classes an�nimas
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o",280));
		cursos.add(new Curso("Programa��o em C essential",125));
		cursos.add(new Curso("Programa��o em Java",0));
		cursos.add(new Curso("Programa��o em Phyton",90));
		cursos.add(new Curso("Banco de Dados",80));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso :: getAlunos) //Alunos � a quantidade de alunos - mapeia de um tipo para outro
			.forEach(System.out::println);
	}

}
