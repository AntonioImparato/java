package org.lessons.java.shop;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuffie cuffie1 = new Cuffie ("px34","boose",65f,"nere",true);
		Cuffie cuffie2 = new Cuffie ("p6784","boose",155.23f,"nere",true);
		System.out.println(cuffie1.codiceEsteso());
		System.out.println(cuffie2.codiceEsteso());
		System.out.println(cuffie1.getMarca());
		
		
		
		Televisori televisore = new Televisori("t45","sony",2658.25f,56f,true);
		
		System.out.println(televisore.codiceEsteso());
		System.out.println(televisore.getPollici());
		System.out.println(televisore.getMarca());
		televisore.setMarca("samsung");
		System.out.println(televisore.getMarca());
	}

}
