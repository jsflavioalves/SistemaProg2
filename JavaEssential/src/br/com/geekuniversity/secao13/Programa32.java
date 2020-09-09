package br.com.geekuniversity.secao13;
// Template Method
/*
 O padrão Template Method define o esqueleto de um algoritmo dentro de um metodo,
 transferindo alguns de seus passos para a subclasse. O Template Method permite 
 que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
 do próprio algoritmo.
 metodo_principal(){
 passo1();
 passo2();
 passo3();
 }
 */
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoIniciodaTemporada tit = new TreinamentoIniciodaTemporada();
		tit.TreinoDiario();
		TreinamentoFimdaTemporada tft = new TreinamentoFimdaTemporada();
		tft.TreinoDiario();
	}

}
