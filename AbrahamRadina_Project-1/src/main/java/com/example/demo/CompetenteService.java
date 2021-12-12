package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Competente;
import com.example.demo.CompetenteRepo;


@Service
public class CompetenteService {
	@Autowired
	CompetenteRepo compRepo;
	
	public List<Competente> listTable()
	{
		List<Competente> findAll = compRepo.findAll();
		for(Competente comp:findAll)
		{
			System.out.println(comp);
		}
		System.out.println("numar entries");
		compRepo.count();
		return findAll;
	}
	
	public void addInTable(Competente c)
	{
		compRepo.save(c);
	}
	
	public void deleteFromTable(Long id)
	{
		compRepo.deleteById(id);
	}
}
