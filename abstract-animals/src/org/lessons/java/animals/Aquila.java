package org.lessons.java.animals;

public class Aquila extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println(" Kreek ");
		
	}

	@Override
	public void mangia() {
		System.out.println(" l'aquila mangia mammiferi di piccolo e media taglia  ");
		
	}

	@Override
	public void vola() {
		 System.out.println("Sta volando!!!");
	}

}
