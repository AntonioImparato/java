package org.lessons.java.animals;

public class Delfino extends Animale implements INuotante{

	@Override
	public void verso() {
		System.out.println(" Whistle, Whistle ");
		
	}

	@Override
	public void mangia() {
		System.out.println(" Il delfino mangia Pesci, crostaacei e molluschi");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sta nuotando!!!");
		
	}

}
