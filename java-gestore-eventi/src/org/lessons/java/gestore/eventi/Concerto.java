package org.lessons.java.gestore.eventi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
	// Dichiarazione degli attributi specifici della classe Concerto
	private LocalTime ora ;
	private float prezzo;
	
	// Costruttore della classe Concerto
	public Concerto(String titolo, LocalDate data, int numeroPostiTotali, float prezzo,LocalTime ora ) {
		super(titolo, data, numeroPostiTotali);
		this.prezzo = prezzo;
		this.ora  = ora;
	}
	
	// Metodi getter e setter per accedere e modificare i campi
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public LocalTime getOra() {
		return this.ora;
	}
	
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	// Metodo per ottenere informazioni sulla data e ora del concerto
	public String infoConcertoData() {
		return super.getData() + " ora: "+ this.ora;
	}
	
	// Metodo per ottenere il prezzo formattato del concerto
	public String infoConcertoPrezzo () {
		 String prezzoFormattato = String.format("%.2f", this.prezzo);
		 return prezzoFormattato;
	}
	
	// Override del metodo toString() per rappresentare l'oggetto Concerto come stringa
	  @Override
	public String toString () {
		return "Data concerto: " + this.infoConcertoData() + " nome evento: " + super.getTitolo() + " prezzo: " + this.infoConcertoPrezzo() + "€";
	}
	  
}
