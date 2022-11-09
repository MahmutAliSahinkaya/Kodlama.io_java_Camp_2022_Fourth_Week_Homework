package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository {

	void add(ProgramingLanguage programingLanguage);
	void update(ProgramingLanguage programingLanguage);
	void delete(int id);
	List<ProgramingLanguage> getAll();
	ProgramingLanguage getById(int id);
	
}

