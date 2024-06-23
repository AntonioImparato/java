package org.lessons.java.shop;

public class Smarphone extends Prodotto{

	private int imei;
	private int memoria;
	public Smarphone(String nome, String marca, float prezzo, int imei, int memoria) {
		super(nome, marca, prezzo);
		this.imei=imei;
		this.memoria=memoria;
		// TODO Auto-generated constructor stub
	}
	
	//get
	public int getImei() {
		return this.imei;
	}
	public int getMemoria() {
		return this.memoria;
	}
	
	//set
	public void setImei(int imei) {
		this.imei=imei;
	}
	public void setMemoria(int memoria) {
		this.memoria=memoria;
	}
}
