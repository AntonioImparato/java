package org.lessons.java.snacks;

import java.util.ArrayList;

public class Search {

	  public static int findElementIndex(ArrayList<String> list, String nameSearch) {
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).equals(nameSearch)) {
	                return i;  // Restituisce l'indice se l'elemento è stato trovato
	            }
	        }
	        return -1;  // Restituisce -1 se l'elemento non è stato trovato
	    }

	    public static void main(String[] args) {
	        // Esempio di utilizzo
	        ArrayList<String> listaNomi = new ArrayList<>();
	        listaNomi.add("Alice");
	        listaNomi.add("Bob");
	        listaNomi.add("Charlie");
	        listaNomi.add("David");
	        
	        String nameSearch = "Charlie";
	        int index = findElementIndex(listaNomi, nameSearch);
	        
	        if (index != -1) {
	            System.out.println("L'elemento '" + nameSearch + "' è stato trovato all'indice: " + index);
	        } else {
	            System.out.println("L'elemento '" + nameSearch + "' non è stato trovato nella lista.");
	        }
	    }
	}