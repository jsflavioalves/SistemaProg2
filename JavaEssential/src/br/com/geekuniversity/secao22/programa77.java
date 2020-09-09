package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams parte 2
public class programa77 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação para Leigos",170));  //classes anônimas
		cursos.add(new Curso("Algoritmos e Lógica de Programação",280));
		cursos.add(new Curso("Programação em C essential",125));
		cursos.add(new Curso("Programação em Java",0));
		cursos.add(new Curso("Programação em Phyton",90));
		cursos.add(new Curso("Banco de Dados",80));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso :: getAlunos) //Alunos é a quantidade de alunos - mapeia de um tipo para outro
			.forEach(System.out::println);
	}

}
