package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Streams s�o fluxos de dados de entrada, ler arquivo e escrever
//Streams + Threads - rodar em paralelo - quando se trabalha com milh�es de dados
public class programa81 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para Leigos", 170)); // classes an�nimas
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o", 280));
		cursos.add(new Curso("Programa��o em C essential", 125));
		cursos.add(new Curso("Programa��o em Java", 0));
		cursos.add(new Curso("Programa��o em Phyton", 90));
		cursos.add(new Curso("Banco de Dados", 80));
		
		cursos.parallelStream()   //utilizando streams em threads
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

	}

}
