package org.lessons.java.gestore.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int numeroPostiTotali;
    private int numeroPostiPrenotati;

    // Costruttore che inizializza i campi dell'evento
    public Evento(String titolo, LocalDate data, int numeroPostiTotali) {
        // Controllo che la data non sia già passata
        if (data.isBefore(LocalDate.now())) {
            System.out.println("Errore: La data non può essere già passata.");
            return; 
        }
        // Controllo che il numero di posti totali sia positivo
        if (numeroPostiTotali <= 0) {
           System.out.println("Errore: Il numero di posti totali deve essere positivo.");
           return; 
        }
        // Inizializzazione dei campi
        this.titolo = titolo;
        this.data = data;
        this.numeroPostiTotali = numeroPostiTotali;
        this.numeroPostiPrenotati = 0; 
    }
    
    // Metodi getter e setter per accedere e modificare i campi
    
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now())) {
            System.out.println("Errore: La data non può essere già passata.");
            return; 
        }
        this.data = data;
    }

    public int getNumeroPostiTotali() {
        return numeroPostiTotali;
    }

    public int getNumeroPostiPrenotati() {
        return numeroPostiPrenotati;
    }
    
    // Metodo per prenotare un posto
    public void prenota() {
        // Controllo se l'evento è già passato
        if (this.data.isBefore(LocalDate.now())) {
            System.out.println("Errore: L'evento è già passato.");
            return; 
        }
        // Controllo se ci sono ancora posti disponibili
        else if (this.numeroPostiPrenotati >= numeroPostiTotali) {
            System.out.println("Errore: I posti sono terminati.");
            return; 
        }
        numeroPostiPrenotati++; 
    }

    // Metodo per disdire una prenotazione
    public void disdici() {
        // Controllo se l'evento è già passato
        if (data.isBefore(LocalDate.now())) {
            System.out.println("Errore: L'evento è già passato.");
            return; 
        }
        // Controllo se ci sono prenotazioni da disdire
        if (numeroPostiPrenotati == 0) {
            System.out.println("Errore: Non ci sono prenotazioni da disdire.");
            return; 
        }
        numeroPostiPrenotati--; 
    }
    
    // Metodo che restituisce il numero di posti disponibili
    public int postiDisponibili() {
        return (numeroPostiTotali - numeroPostiPrenotati);
    }
    
    // Override del metodo toString per fornire una rappresentazione testuale dell'evento
    @Override
    public String toString() {
        return this.data + " " + titolo;
    } 

}
