package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageService {

	void add(ProgramingLanguage programingLanguage) throws Exception;
	void update(ProgramingLanguage programingLanguage) throws Exception;
	void delete(int id);
	List<ProgramingLanguage> getAll();
	ProgramingLanguage getById(int id);
}
