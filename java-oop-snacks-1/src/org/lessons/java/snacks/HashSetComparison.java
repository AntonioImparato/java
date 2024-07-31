package org.lessons.java.snacks;

import java.util.HashSet;

public class HashSetComparison {

    public static boolean haveSameElements(HashSet<String> set1, HashSet<String> set2) {
        // Verifica se i due set hanno gli stessi elementi
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        // Esempi di HashSet
        HashSet<String> setA = new HashSet<>();
        setA.add("apple");
        setA.add("banana");
        setA.add("cherry");

        HashSet<String> setB = new HashSet<>();
        setB.add("cherry");
        setB.add("banana");
        setB.add("apple");

        HashSet<String> setC = new HashSet<>();
        setC.add("apple");
        setC.add("banana");

        // Test della funzione haveSameElements
        System.out.println("setA e setB hanno gli stessi elementi: " + haveSameElements(setA, setB)); // true
        System.out.println("setA e setC hanno gli stessi elementi: " + haveSameElements(setA, setC)); // false
    }
}