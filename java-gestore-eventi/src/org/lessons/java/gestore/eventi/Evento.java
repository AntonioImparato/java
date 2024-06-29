package org.lessons.java.gestore.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int numeroPostiTotali;
    private int numeroPostiPrenotati;

    public Evento(String titolo, LocalDate data, int numeroPostiTotali) {
        if (data.isBefore(LocalDate.now())) {
            System.out.println("Errore: La data non può essere già passata.");
            return;
        }
         if (numeroPostiTotali <= 0) {
           System.out.println("Errore: Il numero di posti totali deve essere positivo.");
           return;
        }
        this.titolo = titolo;
        this.data = data;
        this.numeroPostiTotali = numeroPostiTotali;
        this.numeroPostiPrenotati = 0;
    }
    
    // inizio metodi get e set
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
    // fine metodi get e set 
    
    

}
