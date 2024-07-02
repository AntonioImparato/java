package org.lessons.java.gestore.eventi;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		boolean controllo;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		Concerto concerto = null;
		LocalTime ora = null;
		 //do while per rinserire un evento se l'utenete sbaglia  
		 do { 
			 
			    System.out.println("Inserisci il nome dell'evento");
				String titolo = scanner.nextLine();
				
				System.out.println("Inserisci i numeri di posti per l'evento");
				int posti = scanner.nextInt();
				scanner.nextLine();
				
				
				System.out.println("Inserisci il costo dei biglietti");
				float prezzo = scanner.nextFloat();
				scanner.nextLine();
				
				System.out.println("Inserisci la data dell'evento in formato aaaa/mm/GG");
				String dataEvento = scanner.nextLine();
				
				 System.out.println("Inserisci l'ora in formato HH:mm:");
		            String oraUtente = scanner.nextLine();
		            
			try {
				
				
				// converto l'ora inserita dall'utente in localTime
				ora = LocalTime.parse(oraUtente, formatter);
				
				// Dividi la stringa dataEvento usando il carattere "/"
				String[] parti = dataEvento.split("/");

				// Estrai i componenti dalla stringa suddivisa
				int anno = Integer.parseInt(parti[0]);
				int mese = Integer.parseInt(parti[1]);
				int giorno = Integer.parseInt(parti[2]);
				
				// creo il mio oggetto data fornendo i valori separati 
				LocalDate data = LocalDate.of(anno,mese, giorno);
		
		    
		        concerto = new Concerto (titolo , data , posti, prezzo ,ora );
		        if (concerto.getData()==null) {
		           
		        	controllo = false;
		        } else controllo = true;
		        
				
			} catch (NumberFormatException e ) {
				System.out.println("errore nel inserimento della data ricordati che il formato è aaaa/mm/GG ");
				controllo = false;
			} catch (DateTimeParseException e) {
                System.out.println("Errore nell'inserimento dell'ora. Ricordati che il formato è HH:mm.");
                controllo = false;
			} 
			
		 } while (!controllo);
		
		
			System.out.println("Vuoi effetuare delle prenotazioni (true per si /false per no ) ?");
			boolean scelta = scanner.nextBoolean();
			
			if(scelta) 
			{
				System.out.println("Posti disponibili: "+concerto.postiDisponibili()+" quante prenotazioni vuoi effettuare?" );
				int prenotazioni = scanner.nextInt();
				
				if (prenotazioni <= concerto.postiDisponibili() && prenotazioni > 0 ) 
				{
					for(int i =0; i<prenotazioni; i++) 
					{
						concerto.prenota();
		        	}
				}else { System.out.println("I posti da prenotare deve almeno essere pari a 1 e non deve superare i posti disponibili ");
				        System.out.println("I posti disponibili ne sono:  "+ concerto.postiDisponibili());
				}
			}
			
			System.out.println("Posti prenotati: " + concerto.getNumeroPostiPrenotati());
			System.out.println("Posti disponibili: " + concerto.postiDisponibili());
			
			System.out.println("Vuoi disdire qualche prenotazione (true per si /false per no)?");
		//  riusiamo la stessa variabile 
			scelta = scanner.nextBoolean();
			
			if(scelta) 
			{
				System.out.println("Posti prenotati: "+concerto.getNumeroPostiPrenotati()+" quanti posti vuoi disdire?" );
				int prenotazioni = scanner.nextInt();
				
				if (prenotazioni <= concerto.getNumeroPostiPrenotati() && prenotazioni > 0 ) 
				{
					for(int i =0; i<prenotazioni; i++) 
					{
						concerto.disdici();
		        	}
				}else { System.out.println("I posti da disdire devono almeno essere pari a 1 e non deve superare i posti già prenotati ");
				        System.out.println("I posti prenotati sono:  "+concerto.getNumeroPostiPrenotati());
				}
			}
			
			System.out.println("Posti prenotati: " + concerto.getNumeroPostiPrenotati());
			System.out.println("Posti disponibili: " + concerto.postiDisponibili());
			System.out.println("Posti prenotati: " + concerto.toString());

		scanner.close();

	}

}
