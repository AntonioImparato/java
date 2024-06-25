package org.lessons.java.shop;

public class Smarphone extends Prodotto{

	private int imei;
	private int memoria;
	public Smarphone(String marca, String modello, float prezzo, int imei, int memoria) {
		super(marca, modello, prezzo);
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
	@Override
    public String toString() {
        return "Smarphone  [marca= " + getMarca() +", modello= " + getModello() + ", Prezzo= " + getPrezzo() + "€, Memoria=" + memoria + ", IMEI= " + imei + "]";
    }
}
