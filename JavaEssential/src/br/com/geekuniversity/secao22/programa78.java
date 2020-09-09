package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

//Stream parte 3
public class programa78 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o para Leigos",170));  //classes an�nimas
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o",280));
		cursos.add(new Curso("Programa��o em C essential",125));
		cursos.add(new Curso("Programa��o em Java",0));
		cursos.add(new Curso("Programa��o em Phyton",90));
		cursos.add(new Curso("Banco de Dados",80));

		int soma = cursos.stream()
				.filter(c -> c.getAlunos() >= 100) //n�o � obrigado filtrar
				.mapToInt(Curso :: getAlunos) // permite efetuar c�lculos com o resultado
				.sum();
		
		System.out.println("A soma de todos os cursos com mais de 100 alunos � " + soma);
	}

}
