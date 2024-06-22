package org.lessons.java.shop;

public class main {

	public static void main( String[] args) {
		
		Prodotto prodotto1 = new Prodotto("pepe","pepe di pepe",0.90f);
		Prodotto prodotto2 = new Prodotto("sale","sale di pepe",0.50f);
		Prodotto prodotto3 = new Prodotto("pasta","pepe di pepe",3f);
		Prodotto prodotto4 = new Prodotto("biscotti","pan di sole",5f);
	
		
		System.out.println(prodotto1.codiceEsteso());
		System.out.println(prodotto2.codiceEsteso());
		System.out.println(prodotto3.codiceEsteso());
		System.out.println(prodotto4.codiceEsteso());
		System.out.println(prodotto3.formatCodice(prodotto3.getCodice()));
	}
}
