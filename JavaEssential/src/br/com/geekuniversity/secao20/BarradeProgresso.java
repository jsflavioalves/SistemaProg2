package br.com.geekuniversity.secao20;
/*
 Para executar tarefas em paralelo, nossa classe deve
 implementar a interface Runnable e que têm o método run()
 que deve ser implementado.
 */
public class BarradeProgresso implements Runnable{
	public void executa() {
		//for de 0 até 10 milhões
				for (int i = 0; i < 1000; i++) {
					System.out.println(i +" Barra de Progresso .... aguarde");
				}
	}

	@Override
	public void run() {
		//for de 0 até 10 milhões
		for (int i = 0; i < 1000; i++) {
			System.out.println(i +" Barra de Progresso .... aguarde");
		}
		
	}
}
