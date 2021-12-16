package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Competente;
import com.example.demo.CompetenteRepo;

@Service
public class CompetenteService {
	@Autowired
	private CompetenteRepo compRepo;

	public List<Competente> getAllComp() {
		List<Competente> abouts = new ArrayList<>();
		compRepo.findAll().forEach(abouts::add);
		return abouts;
	}

	public Competente getComp(Long id) {
		return compRepo.findById(id).get();
	}

	public void addComp(Competente about) {
		compRepo.save(about);
	}

	public void updateComp(Long id, Competente about) {
		compRepo.save(about);
	}

	public void deleteComp(Long id) {
		compRepo.deleteById(id);
	}

	public List<Competente> listTable() {
		List<Competente> findAll = compRepo.findAll();
		for (Competente comp : findAll) {
			System.out.println(comp);
		}
		System.out.println("numar entries");
		compRepo.count();
		return findAll;
	}

	public void addInTable(Competente c) {
		compRepo.save(c);
	}

	public void deleteFromTable(Long id) {
		compRepo.deleteById(id);
	}
}
