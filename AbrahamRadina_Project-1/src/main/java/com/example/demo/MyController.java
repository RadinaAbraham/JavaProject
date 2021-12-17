package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	@Autowired
	CompetenteRepo compRepo;

	@Autowired
	CompetenteService compService;

	@Autowired
	private DespreMineService despreMineService;

	@Autowired
	private DespreMineRepo despreMineRepo;
	
	@Autowired
	private EducatieService eduService;

	@Autowired
	private EducatieRepo eduRepo;
	
	@Autowired
	private ExperientaService expService;

	@Autowired
	private ExperientaRepo expRepo;

	 String newLine = System.getProperty("line.separator");
	public DespreMine about = new DespreMine(
			"My primary goal is to apply my technical expertise all throughout the full development "
					+ "life cycle to ensure production and delivery of products and services that meet client specifications. "
					+ "Along with a competent developing team, and with strong personal knowledge and skills, I am positive that this"
					+ " goal can be achieved. One of my objectives is to keep updated with the latest IT trends and technologies.",
			"Eager to improve my knowledge and experience as a developer, being suitable for a company that wants to train an employee according to its own requirements.\r\n"
					+ "Able to adapt and adjust according to every situation.\r\n"
					+ "Deliver small programs, features, modules, and project components in a timely and cost - effective manner.\r\n"
					+ "Good knowledge of Object-Oriented principles and knowledge of Clean Code.\r\n"
					+ "Demonstrate strong problem solving and interpersonal skills.");

	
	@RequestMapping("/about")
	public String getAllAbouts(Model model) {
		List<DespreMine> abouts = despreMineService.getAllAbouts();
		abouts.add(about);
		//despreMineRepo.save(about);
		model.addAttribute("about", abouts);
		return "about";
	}

	@RequestMapping("/about/{id}")
	public DespreMine getAbout(@PathVariable Long id) {
		return despreMineService.getAbout(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/about/{id}")
	public void updateAbout(@RequestBody DespreMine about, @PathVariable Long id) {
		despreMineService.updateAbout(id, about);
	}

	@GetMapping("/deleteAbout")
	public String deleteAbout1(@RequestParam(value = "id") Long id) {
		despreMineRepo.deleteById(id);
		return "" + id;
	}

	@RequestMapping("/addAbout")
	public String addAbout(DespreMine about) {
		despreMineService.addAbout(about);
		return "addAbout";
	}

	public Competente comp = new Competente("C++");
	public Competente comp1 = new Competente("Java & SpringBoot");
	public Competente comp2 = new Competente("C#");
	public Competente comp3 = new Competente("SQL");

	@GetMapping("/comp")
	public String getCompetente(Model model) {

		List<Competente> competente1 = compService.getAllComp();
		competente1.add(comp);
		competente1.add(comp1);
		competente1.add(comp2);
		competente1.add(comp3);
		model.addAttribute("comp", competente1);
		return "comp";
	}

	@RequestMapping("/addComp")
	public String addComp(Competente comp) {
		compService.addComp(comp);
		return "addComp";
	}

	@GetMapping("/deleteComp")
	public String deleteComp(@RequestParam(value = "id") Long id) {
		compRepo.deleteById(id);
		return "" + id;
	}

	@RequestMapping("/comp/{id}")
	public Competente getCompt(@PathVariable Long id) {
		return compService.getComp(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/comp/{id}")
	public void updateComp(@RequestBody Competente comp, @PathVariable Long id) {
		compService.updateComp(id, comp);
	}

	public Experienta exp = new Experienta("Sales Assistant", "07/2019 – 06/2021", "Pandora", "Jewellery Consultant");
	public Experienta exp1 = new Experienta("Intern", "07/2021 – Present", "Rubico",
			"The focus is on refactoring the C++ core of Tekla Structures.");
	
	@GetMapping("/exp")
	public String getExperiente(Model model) {

		List<Experienta> experiente = expService.getAllExp();
		experiente.add(exp);
		experiente.add(exp1);
		model.addAttribute("exp", experiente);
		return "exp";
	}

	@RequestMapping("/addExp")
	public String addExp(Experienta exp) {
		expService.addExp(exp);
		return "addExp";
	}

	@GetMapping("/deleteExp")
	public String deleteExp(@RequestParam(value = "id") Long id) {
		expRepo.deleteById(id);
		return "" + id;
	}

	@RequestMapping("/exp/{id}")
	public Experienta getExp(@PathVariable Long id) {
		return expService.getExp(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/exp/{id}")
	public void updateExp(@RequestBody Experienta exp, @PathVariable Long id) {
		expService.updateExp(id, exp);
	}

	public List<Educatie> educatii = new ArrayList<>();

	public Educatie edu = new Educatie("High School", "Matematica-Informatica",
			"Colegiul National de Informatica 'Grigore Moisil'", "2015-2019");
	{
		educatii.add(edu);
	}

	public Educatie edu1 = new Educatie("Bachelor's degree", "Informatica",
			"Universitatea Transilvania - Facultatea de Matematica si Informatica", "2019-2022");
	{
		educatii.add(edu1);
	}
	
	@GetMapping("/edu")
	public String getEducatii(Model model) {

		List<Educatie> educatii = eduService.getAllEdu();
		educatii.add(edu);
		educatii.add(edu1);
		model.addAttribute("edu", educatii);
		return "edu";
	}

	@RequestMapping("/addEdu")
	public String addEdu(Educatie edu) {
		eduService.addEdu(edu);
		return "addEdu";
	}

	@GetMapping("/deleteEdu")
	public String deleteEdu(@RequestParam(value = "id") Long id) {
		eduRepo.deleteById(id);
		return "" + id;
	}

	@RequestMapping("/edu/{id}")
	public Educatie getEdu(@PathVariable Long id) {
		return eduService.getEdu(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/edu/{id}")
	public void updateEdu(@RequestBody Educatie edu, @PathVariable Long id) {
		eduService.updateEdu(id, edu);
	}
}
