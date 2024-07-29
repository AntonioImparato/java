package org.lessons.java.snacks;

import java.io.FileNotFoundException;

public class OpenFile {

	public static void main(String[] args) {
		
LeggiPrimaRiga leggiRiga = new LeggiPrimaRiga();

try {
	String data = leggiRiga.getFile("./src/org/lessons/java/snacks/readme.txt");
	System.out.println(data);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("è avvenuta un eccezione: "+ e.getStackTrace());
	
}
	}

}
//C:\Users\User\Documents\GitHub\java\java-oop-snacks-1\src\org\lessons\java\snacks\readme.txt