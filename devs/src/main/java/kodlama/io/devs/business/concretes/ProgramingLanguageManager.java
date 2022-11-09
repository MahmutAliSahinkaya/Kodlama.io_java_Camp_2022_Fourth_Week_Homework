package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService{

	private ProgramingLanguageRepository programingLanguageRepository;
	
	
	
	@Autowired
	public ProgramingLanguageManager (ProgramingLanguageRepository programingLanguageRepository) {
		
		this.programingLanguageRepository = programingLanguageRepository;
		
	}
	
	
	@Override
	public void add(ProgramingLanguage programingLanguage) throws Exception {
		
		
		if(programingLanguage.getName() == "") {
			throw new Exception ("Programlama ismi boş bırakılamaz.");
		}
		
		for (ProgramingLanguage languages : programingLanguageRepository.getAll()) {
			
			if(languages.getId() == (programingLanguage.getId())) {
				throw new Exception ("Bu id daha önce kullanılmıştır.");
			}
			if(languages.getName().equals(programingLanguage.getName())  ) {
				throw new Exception ("Bu programlama ismi daha önce kullanılmıştır.");
			}
			
		}
			
			this.programingLanguageRepository.add(programingLanguage);
			
			System.out.println("Programlama dili kaydedildi.");
			
	}


	@Override
	public void update(ProgramingLanguage programingLanguage) throws Exception {
		
		if(programingLanguage.getName() == "") {
			throw new Exception ("Programlama ismi boş bırakılamaz.");
		}
		
		for (ProgramingLanguage languages : programingLanguageRepository.getAll()) {
			
			
			if(languages.getName().equals(programingLanguage.getName())  ) {
				throw new Exception ("Bu programlama ismi daha önce kullanılmıştır.");
			}
			
		}
		this.programingLanguageRepository.update(programingLanguage);
		
	}


	@Override
	public void delete(int id) {
		this.programingLanguageRepository.delete(id);
		
	}


	@Override
	public List<ProgramingLanguage> getAll() {
		
		return this.programingLanguageRepository.getAll();
	}


	@Override
	public ProgramingLanguage getById(int id) {
		
		return this.programingLanguageRepository.getById(id);
	}

}
