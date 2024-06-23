package org.lessons.java.shop;

public class Televisori extends Prodotto{

	private float pollici ;
	private boolean smart;
	public Televisori(String nome, String marca, float prezzo, float pollici, boolean smart) {
		super(nome, marca, prezzo);
		// TODO Auto-generated constructor stub
		
		this.pollici=pollici;
		this.smart=smart;
	}
	//get
		public float getPollici() {
			return this.pollici;
		}
		public boolean getSmart() {
			return this.smart;
		}
		
		//set
		public void setPollici(float pollici) {
			this.pollici=pollici;
		}
		public void setSmart(boolean smart) {
			this.smart=smart;
		}
}
