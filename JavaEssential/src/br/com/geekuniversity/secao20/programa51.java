package br.com.geekuniversity.secao20;
//simulação da geração de relatório + barra de tarefas
// sem a utilização de threads
public class programa51 {

	public static void main(String[] args) {
		BarradeProgresso barra = new BarradeProgresso();
		
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		
		relatorio.executa();

	}

}
