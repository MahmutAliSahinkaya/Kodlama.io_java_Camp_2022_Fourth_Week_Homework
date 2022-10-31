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

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController (ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
		this.programmingLanguageService.add(programmingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestBody int id) {
		this.programmingLanguageService.delete(id);
	}
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll() {
		return this.programmingLanguageService.getAll();
	}
	@PutMapping("/update")
	public void update (@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
		this.programmingLanguageService.update(programmingLanguage);
	}
	@GetMapping("/getById")
	public ProgrammingLanguage getById(int id) {
		return this.programmingLanguageService.getById(id);
	}
}
