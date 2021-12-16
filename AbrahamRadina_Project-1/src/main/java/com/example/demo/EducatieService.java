package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducatieService {
	@Autowired
	private EducatieRepo eduRepo;

	public List<Educatie> getAllEdu() {
		List<Educatie> educatii = new ArrayList<>();
		eduRepo.findAll().forEach(educatii::add);
		return educatii;
	}

	public Educatie getEdu(Long id) {
		return eduRepo.findById(id).get();
	}

	public void addEdu(Educatie edu) {
		eduRepo.save(edu);
	}

	public void updateEdu(Long id, Educatie edu) {
		eduRepo.save(edu);
	}

	public void deleteEdu(Long id) {
		eduRepo.deleteById(id);
	}

	public List<Educatie> listTable() {
		List<Educatie> findAll = eduRepo.findAll();
		for (Educatie comp : findAll) {
			System.out.println(comp);
		}
		return findAll;
	}

	public void addInTable(Educatie c) {
		eduRepo.save(c);
	}

	public void deleteFromTable(Long id) {
		eduRepo.deleteById(id);
	}
}
