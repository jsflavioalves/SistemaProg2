package br.com.geekuniversity.secao13;
// Template Method
public abstract class Treinamento {
	// final é um modificador de acesso que faz com que o elemento
	// que esteja utilizando não possa ser estendida ou reescrita
	final void TreinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	public abstract void preparoFisico();
	public abstract void jogoTreino();
	public final void treinoTatico() {
		System.out.println("Treino Tático");
	}
}
