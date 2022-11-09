package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;

 @Repository
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository{
	
			List<ProgramingLanguage> programingLanguages;
			
			public InMemoryProgramingLanguageRepository () {
				programingLanguages = new ArrayList<ProgramingLanguage>();
				programingLanguages.add(new ProgramingLanguage(1,"JAVA"));
				programingLanguages.add(new ProgramingLanguage(2,"Phyton"));
				programingLanguages.add(new ProgramingLanguage(3,"C++"));
				programingLanguages.add(new ProgramingLanguage(4,"C#"));
				
			}
			

			@Override
			public void add(ProgramingLanguage programingLanguage) {
				
				programingLanguages.add(programingLanguage);
				
			
				
			}

			@Override
			public void update(ProgramingLanguage programingLanguage) {
				
				for (ProgramingLanguage language : programingLanguages) {
					if(language.getId() == programingLanguage.getId()) {
						programingLanguages.set(language.getId() -1, programingLanguage);
					}
				}
				
			}

			@Override
			public void delete(int id) {
				programingLanguages.remove(id-1);				
			}

			@Override
			public List<ProgramingLanguage> getAll() {
				
				return programingLanguages;
			}


			@Override
			public ProgramingLanguage getById(int id) {
				
				return programingLanguages.get(id-1);
			}

	
	
}
