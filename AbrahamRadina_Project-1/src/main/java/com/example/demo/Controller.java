package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	public List<Experience> experiente= new ArrayList<>();
	public Experience exp=new Experience("Sales Assistant", "07/2019 – 06/2021", "Pandora", "Jewellery Consultant");
	{
		experiente.add(exp);
	}
	public Experience exp1=new Experience("Intern", "07/2021 – Present", "Rubico", "The focus is on refactoring the C++ core of Tekla Structures.");
	{
		experiente.add(exp1);
	}
	
	@GetMapping("/exp")
	public List<Experience> getExperience() {
		System.out.println(experiente);
		return experiente;
	}
	
	@PostMapping(value="exp/add")
	public List<Experience> addExperience(Experience exp)
	{
		experiente.add(new Experience(exp.getFunctie(),exp.getPerioada(),exp.getCompanie(),exp.getDescriere()));
		return experiente;
	}
}
