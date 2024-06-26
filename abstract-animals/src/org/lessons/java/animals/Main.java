package org.lessons.java.animals;



public class Main {
	
	public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
	public static void main(String[] args) {
		
	System.out.println("-------------------------------------------------------");
	Aquila aquila= new Aquila();
	aquila.dormi();
	aquila.mangia();
	faiVolare(aquila);
	
	System.out.println("-------------------------------------------------------");
	Delfino delfino= new Delfino();
	delfino.dormi();
	delfino.mangia();
	delfino.verso();
	faiNuotare(delfino);
	
	System.out.println("--------------------------------------------------------");
	Passerotto passerotto= new Passerotto();
	passerotto.dormi();
	passerotto.mangia();
	passerotto.verso();
	passerotto.vola();
	faiVolare(passerotto);
	System.out.println("---------------------------------------------------------");
	
	
	Cane cane= new Cane();
	cane.dormi();
	cane.mangia();
	cane.verso();
	System.out.println("----------------------------------------------------------");
	
	
	}

}
