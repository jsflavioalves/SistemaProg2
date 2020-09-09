package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

public class programa79 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170)); // classes anônimas
		cursos.add(new Curso("Algoritmos e Lógica de Programação", 280));
		cursos.add(new Curso("Programação em C essential", 125));
		cursos.add(new Curso("Programação em Java", 0));
		cursos.add(new Curso("Programação em Phyton", 90));
		cursos.add(new Curso("Banco de Dados", 80));

		cursos.stream()
			  .filter(c -> c.getAlunos() >= 100)
			  //.findAny()  //pega qualquer um de acordo com o filtro
			  .findFirst()
			  .ifPresent(System.out::println); //se encontrar algum
	}

}
