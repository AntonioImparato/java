package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    private int codice;
    private String nome;
    private String marca;
    private float prezzo;
    private float iva;
    
    public Prodotto(String nome, String marca, float prezzo) {
        Random random = new Random();
        this.codice = random.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = 22.0f;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    public float prezzoIva() {
        return ((prezzo * iva) / 100) + prezzo;
    }
    
    public String codiceEsteso() {
       // return String.format("%06d %s", codice, nome);
    	return codice + nome;
    }
    
    // Metodo statico per formattare il codice
    public static String formatCodice(int codice) {
        return String.format("%08d", codice);
    }
}