package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experienta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String functie;
	private String perioada;
	private String companie;
	private String descriere;
	
	public Experienta() {
		super();
	}
	public Experienta(String functie, String perioada, String companie, String descriere) {
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
