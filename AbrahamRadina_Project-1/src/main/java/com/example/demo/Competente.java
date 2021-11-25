package com.example.demo;

public class Competente {
	private String categorie;
	private String aptitudine;
	
	public Competente(String categorie, String aptitudine) {
		super();
		this.categorie = categorie;
		this.aptitudine = aptitudine;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAptitudine() {
		return aptitudine;
	}
	public void setAptitudine(String aptitudine) {
		this.aptitudine = aptitudine;
	}
	@Override
	public String toString() {
		return "Competente [categorie=" + categorie + ", aptitudine=" + aptitudine + "]";
	}
	
}
