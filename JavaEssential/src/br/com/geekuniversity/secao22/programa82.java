package br.com.geekuniversity.secao22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//Datas e times
public class programa82 {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);  //mostra no formato ISO internacional
		
		LocalDate ano_novo = LocalDate.of(2021, Month.JANUARY, 1);
		
		System.out.println(ano_novo);
		
		int ano = ano_novo.getYear();
		Month mes = ano_novo.getMonth();
		int dia = ano_novo.getDayOfMonth();
		
		System.out.println("O ano novo será em " + dia + " de mês " + mes + " de ano " + ano);
		
		Period periodo = Period.between(hoje, ano_novo);
		System.out.println("Faltam "+periodo.getMonths()+" meses "+periodo.getDays()+" dias para o ano novo");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		DateTimeFormatter formatadorhoras = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"); //HH é no intervalo de 24 horas
		//hh é no intervalo de 12 horas
		System.out.println(agora.format(formatadorhoras));
		
		LocalTime intervalo = LocalTime.of(9, 30);
		System.out.println(intervalo);
	}

}
