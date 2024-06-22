package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	protected static int codice;
	protected static String nome;
	protected static String marca;
	protected static float prezzo;
	protected static float iva;
	
	public Prodotto(int codice, String nome, String marca, float prezzo ) {
		
		Random random = new Random();
		int numero = random.nextInt(999999);
		codice = numero;
		this.codice = codice;
		
		this.setNome(nome);
		this.setMarca(marca);
		this.setPrezzo(prezzo);
		this.iva = 22.0f ;
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
		this.iva = 5;
	}
	
	public static void shop() {
		System.out.println("Elenco dettagli del prodotto ->");
		System.out.println("Codice: " + codice);
		System.out.println("Nome: " + nome);
		System.out.println("Marca: " + marca);
		System.out.println("Prezzo: €" + prezzo);
		System.out.println("Iva: %" + iva);
	}

}