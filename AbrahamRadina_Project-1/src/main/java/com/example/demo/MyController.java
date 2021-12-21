package com.example.demo;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/about")
	public String getAllAbouts(Model model) {
		List<DespreMine> abouts = despreMineService.getAllAbouts();
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

	@GetMapping("/comp")
	public String getCompetente(Model model) {

		List<Competente> competente1 = compService.getAllComp();
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
	
	@GetMapping("/exp")
	public String getExperiente(Model model) {

		List<Experienta> experiente = expService.getAllExp();
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

	
	@GetMapping("/edu")
	public String getEducatii(Model model) {

		List<Educatie> educatii = eduService.getAllEdu();
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
