package org.lessons.java.security;

import java.util.Scanner;

public class PswGenerator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String nome = input.nextLine();		

		System.out.println("Inserisci il tuo cognome");
		String cognome = input.nextLine();			
		
		System.out.println("Inserisci il numero del giorno di nascita");
		int etaDay = input.nextInt();
		
		System.out.println("Inserisci il numero del mese di nascita");
		int etaMonth = input.nextInt();
		
		System.out.println("Inserisci Il tuo anno di nascita");
		int etaYear = input.nextInt();
		
		int sum = etaDay + etaMonth + etaYear;
				
		System.out.println("La password generata è: " + nome + '-' + cognome + '-' + sum);
	}
	
}
