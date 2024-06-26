package org.lessons.java.animals;

public class Passerotto extends Animale implements IVolante{
	
	@Override
	public void verso() {
		System.out.println(" cip cip");
		
	}

	@Override
	public void mangia() {
		System.out.println(" il passerotto mangia semi o insetti");
		
	}

	@Override
	public void vola() {
		 System.out.println("Sta volando!!!");
		
	}

}

