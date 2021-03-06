package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educatie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String tip;
	private String specializare;
	private String institutie;
	private String perioada;
	
	public Educatie() {
		super();
	}
	public Educatie(String tip, String specializare, String institutie, String perioada) {
		super();
		this.tip = tip;
		this.specializare = specializare;
		this.institutie = institutie;
		this.perioada = perioada;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getSpecializare() {
		return specializare;
	}
	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}
	public String getInstitutie() {
		return institutie;
	}
	public void setInstitutie(String institutie) {
		this.institutie = institutie;
	}
	public String getPerioada() {
		return perioada;
	}
	public void setPerioada(String perioada) {
		this.perioada = perioada;
	}
	@Override
	public String toString() {
		return "Educatie [tip=" + tip + ", specializare=" + specializare + ", institutie=" + institutie + ", perioada="
				+ perioada + "]";
	}

}
