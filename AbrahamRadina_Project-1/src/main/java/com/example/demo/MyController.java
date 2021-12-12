package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.CompetenteRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	@Autowired
	CompetenteRepo compRepo;
	
	@Autowired
	CompetenteService compService;
	
	
	@GetMapping("/addComp")
	public String getCompetente1() { 
		Competente c=new Competente("Java");
		compService.addInTable(c);
		return compService.listTable().toString();
	}
	
	@GetMapping("/deleteComp")
	public String deleteComp(@RequestParam(value="id")Long id) { 
		compService.deleteFromTable(id);
		//compRepo.deleteById(id);
		return ""+id;
	}
	
	public List<Experience> experiente= new ArrayList<>();
	public Experience exp=new Experience("Sales Assistant", "07/2019 – 06/2021", "Pandora", "Jewellery Consultant");
	{
		experiente.add(exp);
	}
	public Experience exp1=new Experience("Intern", "07/2021 – Present", "Rubico", "The focus is on refactoring the C++ core of Tekla Structures.");
	{
		experiente.add(exp1);
	}
	
	public List<Competente> competente= new ArrayList<>();
	
	public Competente comp=new Competente("C++");
	{
		competente.add(comp);
	}
	
	public Competente comp1=new Competente("Java & SpringBoot");
	{
		competente.add(comp1);
	}
	
	public Competente comp2=new Competente("C#");
	{
		competente.add(comp2);
	}
	public Competente comp3=new Competente("SQL");
	{
		competente.add(comp3);
	}
	
public List<Educatie> educatii= new ArrayList<>();
	
	public Educatie edu=new Educatie("High School", "Matematica-Informatica", "Colegiul National de Informatica 'Grigore Moisil'", "2015-2019");
	{
		educatii.add(edu);
	}
	
	public Educatie edu1=new Educatie("Bachelor's degree", "Informatica", "Universitatea Transilvania - Facultatea de Matematica si Informatica", "2019-2022");
	{
		educatii.add(edu1);
	}
	@GetMapping("/exp")
	public String getExperience(Model model) {
		model.addAttribute("exp", experiente);
		return "exp";
	}
	
	@GetMapping("/comp")
	public String getCompetente(Model model) {
		
		model.addAttribute("comp", competente);
//		/return compService.listTable().toString();
		Competente c=new Competente("Java");
		compService.addInTable(c);
		compService.listTable().toString();
		return "comp";
	}
	
	@GetMapping("/edu")
	public String getEducatie(Model model) {
		
		model.addAttribute("edu", educatii);
		return "edu";
	}
	
	@PostMapping(value="exp/add")
	public List<Experience> addExperience(Experience exp)
	{
		experiente.add(new Experience(exp.getFunctie(),exp.getPerioada(),exp.getCompanie(),exp.getDescriere()));
		return experiente;
	}
}
