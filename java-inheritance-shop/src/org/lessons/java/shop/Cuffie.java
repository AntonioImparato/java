package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;
	public Cuffie(String nome, String marca, float prezzo, String colore, boolean wireless) {
		super(nome, marca, prezzo);
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
	
	
}
