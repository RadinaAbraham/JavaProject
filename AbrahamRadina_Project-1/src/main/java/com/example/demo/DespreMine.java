package com.example.demo;

public class DespreMine {
	private String scop;
	private String descriere;
	
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
