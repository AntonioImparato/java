package org.lessons.java.gestore.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProgrammaEventi {
    private String titolo;
    private List<Evento> eventi;

    public ProgrammaEventi(String titolo) {
        this.titolo = titolo;
        this.eventi = new ArrayList<Evento>();
    }
    
    //Metodo aggiungi titolo 
    public void aggiungiEvento(Evento evento) {
    	eventi.add(evento);
    }
    
    // Metodo per restituire una lista di eventi in una certa data
    public List<Evento> eventiInData(LocalDate data) {
        List<Evento> eventiInData = new ArrayList<Evento>();
        for (Evento evento : eventi) {
            if (evento.getData().equals(data)) {
                eventiInData.add(evento);
            }
        }
        return eventiInData;
    }
    
    public List<Evento> getEventi() {
    	return eventi;
    }
    
    //metodo per eventi totali   
    public int EventiTotali (){
    	return eventi.size();
    }
    
    //metodo per svuottare la lista 
    public void SvuotaEventi (){
    	 eventi.clear();
    }
    
//    public String stampaEventiInOrdine() {
//    	List<Evento> eventiOrdinati = new ArrayList<Evento>();
//    	for(Evento evento : eventi) {
//    		eventiOrdinati.add(evento);
//    	}
//    	//eventiOrdinati.sort();
//    	
//    }
    
    
}
