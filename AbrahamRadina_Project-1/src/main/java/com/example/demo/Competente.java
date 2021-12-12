package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String aptitudine;

	public Competente() {
		super();
	}

	public Competente(String aptitudine) {
		super();
		this.aptitudine = aptitudine;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAptitudine() {
		return aptitudine;
	}

	public void setAptitudine(String aptitudine) {
		this.aptitudine = aptitudine;
	}

	@Override
	public String toString() {
		return "Competente [aptitudine=" + aptitudine + "]";
	}
	
	
}
