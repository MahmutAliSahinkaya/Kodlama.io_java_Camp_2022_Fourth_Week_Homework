package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(int id);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
}
