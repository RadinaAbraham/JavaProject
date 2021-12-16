package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperientaService {
	@Autowired
	private ExperientaRepo expRepo;

	public List<Experienta> getAllExp() {
		List<Experienta> experienta = new ArrayList<>();
		expRepo.findAll().forEach(experienta::add);
		return experienta;
	}

	public Experienta getExp(Long id) {
		return expRepo.findById(id).get();
	}

	public void addExp(Experienta exp) {
		expRepo.save(exp);
	}

	public void updateExp(Long id, Experienta exp) {
		expRepo.save(exp);
	}

	public void deleteEdu(Long id) {
		expRepo.deleteById(id);
	}

	public List<Experienta> listTable() {
		List<Experienta> findAll = expRepo.findAll();
		for (Experienta exp : findAll) {
			System.out.println(exp);
		}
		return findAll;
	}

}
