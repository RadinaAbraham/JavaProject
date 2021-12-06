package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String getExperience(Model model) {
		Experience exp=new Experience("Sales Assistant", "07/2019 – 06/2021", "Pandora", "Jewellery Consultant");
		Experience exp1=new Experience("Intern", "07/2021 – Present", "Rubico", "The focus is on refactoring the C++ core of Tekla Structures.");
		experiente.add(exp);
		experiente.add(exp1);
		model.addAttribute("exp", experiente);
		return "file1";
	}
	
//	@GetMapping("/exp")
//	public Experience greeting(@PathVariable(name="exp", required=false) Experience name,Experience name1, Model model) {
//		name=new Experience("Sales Assistant", "07/2019 – 06/2021", "Pandora", "Jewellery Consultant");
//		{
//			experiente.add(exp);
//		}
//		model.addAttribute("exp", name);
//		name1=new Experience("Intern", "07/2021 – Present", "Rubico", "The focus is on refactoring the C++ core of Tekla Structures.");
//		{
//			experiente.add(exp1);
//		}
//		model.addAttribute("exp", name1);
//		return name;
//	}
	
	@PostMapping(value="exp/add")
	public List<Experience> addExperience(Experience exp)
	{
		experiente.add(new Experience(exp.getFunctie(),exp.getPerioada(),exp.getCompanie(),exp.getDescriere()));
		return experiente;
	}
}
