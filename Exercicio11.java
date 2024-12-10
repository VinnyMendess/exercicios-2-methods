package lista2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String HoraAtual = exibirHoraAtual();
		System.out.println(HoraAtual);

	}
	
	public static String exibirHoraAtual() {
		
		LocalTime localtime = LocalTime.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
		
		return localtime.format(formato);
	}

}


/*
 * 
 * package lista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio7 {
	public static void main(String [] args) {
		
		String DataAtual = OnterDataAtual();
		
		System.out.println(DataAtual);
	}
	
	public static String OnterDataAtual() {
		
		LocalDate dataAtual = LocalDate.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return dataAtual.format(formato);
	}

}

 */

