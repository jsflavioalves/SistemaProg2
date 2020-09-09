package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Stream parte 4
public class programa80 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170)); // classes anônimas
		cursos.add(new Curso("Algoritmos e Lógica de Programação", 280));
		cursos.add(new Curso("Programação em C essential", 125));
		cursos.add(new Curso("Programação em Java", 0));
		cursos.add(new Curso("Programação em Phyton", 90));
		cursos.add(new Curso("Banco de Dados", 80));
		
//		List<Curso>	resultado = cursos.stream()
//				.filter(c -> c.getAlunos() >= 100)
//				.collect(Collectors.toList());
//		resultado.forEach(System.out::println);
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
	}

}
