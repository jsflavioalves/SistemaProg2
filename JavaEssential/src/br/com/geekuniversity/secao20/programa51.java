package br.com.geekuniversity.secao20;
//simula��o da gera��o de relat�rio + barra de tarefas
// sem a utiliza��o de threads
public class programa51 {

	public static void main(String[] args) {
		BarradeProgresso barra = new BarradeProgresso();
		
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		
		relatorio.executa();

	}

}
