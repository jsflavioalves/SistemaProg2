package br.com.geekuniversity.secao18;
import javax.swing.JFrame;

public class Graficos extends JFrame{

	public Graficos() {
	      super( "Meu Primeiro Grafico" ); //Define o titulo da tela
	      //add grafico
	     
	      this.pack(); //para ajustar automaticamente o Frame
	   }
	
	public static void main(String[] args) {
		new Graficos().setVisible( true );

	}

}
