package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DespreMine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String scop;
	private String descriere;
	
	public DespreMine() {
		super();
	}

	public DespreMine(String scop, String descriere) {
		super();
		this.scop = scop;
		this.descriere = descriere;
	}
	
	public String getScop() {
		return scop;
	}
	public void setScop(String scop) {
		this.scop = scop;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	@Override
	public String toString() {
		return "DespreMine [scop=" + scop + ", descriere=" + descriere + "]";
	}

}
