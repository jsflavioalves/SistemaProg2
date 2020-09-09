package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
	public Aluno alunos[] = new Aluno[100];
	private int total =0;
	
	public void adiciona(Aluno aluno, int posicao) {
		this.garantirEspaco();
		if (!posicaocupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		for (int i = total - 1; i >= posicao; i--) {
			alunos[i+1]=alunos[i];
		}
		alunos[posicao]=aluno;
		total++;
	}
	
	public void adicionar (Aluno aluno) {
//		for (int i = 0; i < alunos.length; i++) {
//			if (alunos[i]==null) {
//				alunos[i]=aluno;
//				break;
//			}
//		}
		this.garantirEspaco();
		this.alunos[total]=aluno;
		total = total + 1;
	}
	
	public Aluno pega(int posicao) {
		if (!posicaocupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i]=this.alunos[i+1];
		}
		total--;
		//this.alunos[posicao]=null;
	}
	
	public boolean contemaluno(Aluno aluno) {
		// descobre se o aluno está
		for (int i = 0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		// devolve a quantidade de alunos
		return this.total;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos); // facilita a visualização do array
	}
	
	private boolean posicaocupada (int posicao) {
		return posicao>=0 && posicao < total;
	}
	
	private void garantirEspaco() {
		//verifica se o array alunos está cheio
		if (total == alunos.length) {
			//caso esteja cheio, cria o dobro do tamanho do array anterior
			Aluno novoArray[] = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i]=alunos[i];
			}
			this.alunos = novoArray;
		}
	}
}