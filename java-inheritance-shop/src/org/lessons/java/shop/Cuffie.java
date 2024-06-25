package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;
	public Cuffie(String marca,String modello, float prezzo, String colore, boolean wireless) {
		super(marca, modello, prezzo);
		// TODO Auto-generated constructor stub
		this.colore=colore;
		this.wireless=wireless;
	}
	
	public String getColore() {
		return this.colore;
	}
	public boolean getWireless() {
		return this.wireless;
	}
	
	//set
	public void setColore(String colore) {
		this.colore=colore;
	}
	public void setWireless(boolean wireless) {
		this.wireless=wireless;
	}
	
	  @Override
	    public String toString() {
	        return "Cuffie  [marca= " + getMarca() +", modello= " + getModello() + ", Prezzo= " + getPrezzo() +"€, colore= " + getColore() + ", Prezzo= " + getPrezzo() + ", Wireless= " + wireless + "]";
	    }
	
}
