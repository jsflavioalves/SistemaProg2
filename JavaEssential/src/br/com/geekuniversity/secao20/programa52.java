package br.com.geekuniversity.secao20;
//simula��o da gera��o de relat�rio + barra de tarefas
//com a utiliza��o de threads
public class programa52 {

	public static void main(String[] args) {
        BarradeProgresso barra = new BarradeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();

	}

}
