package org.lessons.java.gestore.eventi;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
			System.out.println("Inserisci il nome dell'evento");
			String titolo = scanner.nextLine();
			System.out.println("Inserisci i numeri di posti per l'evento");
			int posti = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Inserisci la data dell'evento in formato aaaa/mm/GG");
			String dataEvento = scanner.nextLine();

			 // Dividi la stringa usando il carattere "/"
	        String[] parti = dataEvento.split("/");

	        // Estrai i componenti dalla stringa suddivisa
	        int anno = Integer.parseInt(parti[0]);
	        int mese = Integer.parseInt(parti[1]);
	        int giorno = Integer.parseInt(parti[2]);
	   
	        LocalDate date1 = LocalDate.of(anno,mese, giorno);
			Evento evento = new Evento(titolo , date1 , posti);
			
			System.out.println("Vuoi effetuare delle prenotazioni (true per si /false per no ) ?");
			boolean scelta = scanner.nextBoolean();
			
			if(scelta) 
			{
				System.out.println("Posti disponibili: "+evento.postiDisponibili()+" quante prenotazioni vuoi effettuare ?" );
				int prenotazioni = scanner.nextInt();
				
				if (prenotazioni <= evento.postiDisponibili() && prenotazioni > 0 ) 
				{
					for(int i =0; i<prenotazioni; i++) 
					{
		        		evento.prenota();
		        	}
				}else { System.out.println("I posti da prenotare deve almeno essere pari a 1 e non deve superare i posti disponibili ");
				        System.out.println("I posti disponibili ne sono:  "+evento.postiDisponibili());
				}
			}
			
			System.out.println("Posti prenotati: " + evento.getNumeroPostiPrenotati());
			System.out.println("Posti disponibili: " + evento.postiDisponibili());
			
			System.out.println("Vuoi disdire qualche prenotazione (true per si /false per no)  ?");
		//  riusiamo la stessa variabile 
			scelta = scanner.nextBoolean();
			
			if(scelta) 
			{
				System.out.println("Posti prenotati: "+evento.getNumeroPostiPrenotati()+" quanti posti vuoi disdire?" );
				int prenotazioni = scanner.nextInt();
				
				if (prenotazioni <= evento.getNumeroPostiPrenotati() && prenotazioni > 0 ) 
				{
					for(int i =0; i<prenotazioni; i++) 
					{
		        		evento.disdici();
		        	}
				}else { System.out.println("I posti da disdire devono almeno essere pari a 1 e non deve superare i posti già prenotati ");
				        System.out.println("I posti prenotati sono:  "+evento.getNumeroPostiPrenotati());
				}
			}
			
			System.out.println("Posti prenotati: " + evento.getNumeroPostiPrenotati());
			System.out.println("Posti disponibili: " + evento.postiDisponibili());
			System.out.println("Posti prenotati: " + evento.toString());
//	            evento.disdici();
//	    		
//	        	System.out.println(evento.getData());
//	        	evento.getNumeroPostiTotali();
//	        	evento.postiDisponibili();
//	        	
//	        	evento.postiDisponibili();
//	        	System.out.println(evento.getNumeroPostiTotali());
//	        	System.out.println(evento.getNumeroPostiPrenotati());
//	        	
//	        	for(int i =0; i<352; i++) {
//	        		evento.disdici();
//	        	}
//	        	evento.postiDisponibili();
//	        	
//	        	System.out.println(evento.toString());
//	        	System.out.println(evento.getNumeroPostiPrenotati());
//	        	
	        	
	
		scanner.close();
	
		
		
		
		

	}

}
