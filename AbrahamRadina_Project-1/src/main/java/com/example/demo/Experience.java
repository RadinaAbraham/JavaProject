package com.example.demo;

public class Experience {
	private String functie;
	private String perioada;
	private String companie;
	private String descriere;

	public Experience(String functie, String perioada, String companie, String descriere) {
		super();
		this.functie = functie;
		this.perioada = perioada;
		this.companie = companie;
		this.descriere = descriere;
	}
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	public String getPerioada() {
		return perioada;
	}
	public void setPerioada(String perioada) {
		this.perioada = perioada;
	}
	public String getCompanie() {
		return companie;
	}
	public void setCompanie(String companie) {
		this.companie = companie;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	
	@Override
	public String toString() {
		return "Experience [functie=" + functie + ", perioada=" + perioada + ", companie=" + companie + ", descriere="
				+ descriere + "]";
	}
}
