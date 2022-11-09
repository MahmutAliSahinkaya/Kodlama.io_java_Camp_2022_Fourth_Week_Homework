package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;

@RestController
@RequestMapping("/api/programingLanguages")
public class ProgramingLanguagesController {
	
	private ProgramingLanguageService programingLanguageService;
	
	@Autowired
	public ProgramingLanguagesController (ProgramingLanguageService programingLanguageService) {
		this.programingLanguageService = programingLanguageService;
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody ProgramingLanguage programingLanguage) throws Exception {
		this.programingLanguageService.add(programingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestBody int id) {
		this.programingLanguageService.delete(id);
	}
	@GetMapping("/getAll")
	public List<ProgramingLanguage> getAll() {
		return this.programingLanguageService.getAll();
	}
	@PutMapping("/update")
	public void update (@RequestBody ProgramingLanguage programingLanguage) throws Exception {
		this.programingLanguageService.update(programingLanguage);
	}
	@GetMapping("/getById")
	public ProgramingLanguage getById(int id) {
		return this.programingLanguageService.getById(id);
	}
}
