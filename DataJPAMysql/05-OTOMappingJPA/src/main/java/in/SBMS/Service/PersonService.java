package in.SBMS.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.PersonRepo;
import in.SBMS.entities.Passport;
import in.SBMS.entities.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	
	
	public void saveData() {

		Person person = new Person();
		person.setName("Digvijay");
		person.setEmail("digvijay@gmail.com");

		Passport passport = new Passport();
		passport.setPassportNum("KM797979");
		passport.setIssueDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));

		person.setPassport(passport);
		passport.setPerson(person);

		personRepo.save(person);

	}
	
	public void deleteInfo() {
			
		personRepo.deleteById(1);
		
	}
}