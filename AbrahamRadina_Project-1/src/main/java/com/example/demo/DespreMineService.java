package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DespreMineService {

	@Autowired
	private DespreMineRepo despreMineRepo;
	
	public List<DespreMine> getAllAbouts() {
		List<DespreMine> abouts = new ArrayList<>();
		despreMineRepo.findAll()
						 .forEach(abouts::add);
		return abouts;
	}
	
	public DespreMine getAbout(Long id) {
		return despreMineRepo.findById(id).get();
	}

	public void addAbout(DespreMine about) {
		despreMineRepo.save(about);
	}

	public void updateAbout(Long id, DespreMine about) {
		despreMineRepo.save(about);
	}

	public void deleteAbout(Long id) {
		despreMineRepo.deleteById(id);
	}	
}
