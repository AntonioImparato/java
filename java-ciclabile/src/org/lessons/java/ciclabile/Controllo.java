package org.lessons.java.ciclabile;

public class Controllo {
	private int[] arryInteri; 
	private int index;
 

	public Controllo(int[] arryInteri) {
		this.arryInteri=arryInteri;
		index=0;
	}
	
	   public int getElementoSuccessivo() {
	        if (hasAncoraElementi()) {
	            int elemento = arryInteri[index];
	            index = (index + 1) ;
	            return elemento;
	        } else {
	            throw new IndexOutOfBoundsException("Non ci sono più elementi da restituire.");
	        }
	    }
	
	  public boolean hasAncoraElementi() {
	        return arryInteri.length > 0; // Ci sono ancora elementi se la lunghezza dell'array è maggiore di zero
	    }
}
