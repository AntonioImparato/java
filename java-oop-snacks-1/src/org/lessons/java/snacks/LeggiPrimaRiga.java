package org.lessons.java.snacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiPrimaRiga  {

	public  String getFile (String filePath) throws FileNotFoundException {
		
		  File file = new File(filePath);
	      Scanner myReader = new Scanner(file);
	      String risultato = "";
	     if( myReader.hasNextLine()) {
	    	 risultato =  myReader.nextLine();
	     }
	     myReader.close();
		return risultato;
	}
}
