package org.lessons.java.shop;

  

public class Carrello {
	
    private Prodotto prodotto;

    public void aggiungiProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public void stampaCarrello() {
        if (prodotto != null) {
            System.out.println(prodotto);
        } else {
            System.out.println("Il carrello è vuoto.");
        }
    }
 
	public static void main(String[] args) {
		 
		Carrello carrello = new Carrello();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("cosa vuoi valorizzare nel carrello ?");
		String scelta= scanner.nextLine();
		
		System.out.println("inserisci la marca");
	    String marca= scanner.nextLine();
	    
	    System.out.println("inserisci la modello");
	    String modello= scanner.nextLine();
	    
	    System.out.println("inserisci il costo");
	    float prezzo= scanner.nextFloat();
	    
	    
	    switch (scelta.toLowerCase()) 
		{
	    case "televisori":
			 System.out.println("quanti pollici è il televisore?");
			    float pollici= scanner.nextFloat();
			    System.out.println("è smart tv?");
			    boolean smart= scanner.nextBoolean();
			    carrello.aggiungiProdotto(new Televisori(marca, modello, prezzo, pollici, smart));
                break;
	    case "smarphone":
	    	   System.out.println("codice IMEI: ");
               int imei = scanner.nextInt();
               System.out.println("Memoria (GB): ");
               int memoria = scanner.nextInt();
               carrello.aggiungiProdotto(new Smarphone(marca, modello, prezzo,imei, memoria));
               break;
	    case "cuffie":
	        System.out.print("colore: ");
            String colore = scanner.nextLine();
            System.out.print("Wireless (true/false): ");
            boolean wireless = scanner.nextBoolean();
            carrello.aggiungiProdotto(new Cuffie(marca,modello, prezzo, colore, wireless));
            break;
		}
	    
	    System.out.println("Contenuto del carrello:");
        carrello.stampaCarrello();
        scanner.close();
		
		//Cuffie cuffie1 = new Cuffie ("px34","boose",65f,"nere",true);
		//Cuffie cuffie2 = new Cuffie ("p6784","boose",155.23f,"nere",true);
		//System.out.println(cuffie1.codiceEsteso());
		//System.out.println(cuffie2.codiceEsteso());
	//	System.out.println(cuffie1.getMarca());
		
		
		
		
		

		
		
		
		
		
	}

}
