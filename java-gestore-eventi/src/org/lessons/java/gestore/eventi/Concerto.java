package org.lessons.java.gestore.eventi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
	private LocalTime ora ;
	private float prezzo;
	public Concerto(String titolo, LocalDate data, int numeroPostiTotali, float prezzo,LocalTime ora ) {
		super(titolo, data, numeroPostiTotali);
		this.prezzo = prezzo;
		this.ora  = ora;
		

	}
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public LocalTime getora() {
		return this.ora;
	}
	
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

}
