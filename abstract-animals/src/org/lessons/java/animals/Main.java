package org.lessons.java.animals;

public class Main {
	public static void main(String[] args) {
		
	System.out.println("-------------------------------------------------------");
	Aquila aquila= new Aquila();
	aquila.dormi();
	aquila.mangia();
	aquila.verso();
	
	System.out.println("-------------------------------------------------------");
	Delfino delfino= new Delfino();
	delfino.dormi();
	delfino.mangia();
	delfino.verso();
	
	System.out.println("--------------------------------------------------------");
	Passerotto passerotto= new Passerotto();
	passerotto.dormi();
	passerotto.mangia();
	passerotto.verso();
	System.out.println("---------------------------------------------------------");
	
	
	Cane cane= new Cane();
	cane.dormi();
	cane.mangia();
	cane.verso();
	System.out.println("----------------------------------------------------------");
	
	
	}

}
