package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    private int codice;
    private String marca;
    private String modello;
    private float prezzo;
    private float iva;
    
    public Prodotto(String marca, String modello, float prezzo) {
        Random random = new Random();
        this.codice = random.nextInt(999999);
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.iva = 22.0f;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getModello() {
        return this.modello;
    }

    public void setNome(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    public float prezzoIva() {
        return ((prezzo * iva) / 100) + prezzo;
    }
    
    public String codiceEsteso() {
       // return String.format("%06d %s", codice, marca);
    	return codice + marca;
    }
    
    // Metodo statico per formattare il codice
    public static String formatCodice(int codice) {
        return String.format("%08d", codice);
    }
    @Override
    public String toString() {
        return "Prodotto [Nome=" + marca + ", modello="+ modello + ", Prezzo=" + prezzo + "]";
    }

}