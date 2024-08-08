package in.SBMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.PersonRepo;
import in.SBMS.entities.Person;
import in.SBMS.entities.PersonPK;

@Service
public class PersonService {

	@Autowired
	private PersonRepo perRepo;
	
	public void getPerson() {

		PersonPK pk=new PersonPK();
		pk.setAdhar(7866868689l);
		pk.setPassNo("G51FRF54D54");
		
		Optional<Person> byId = perRepo.findById(pk);
		
		if(byId.isPresent()) {
			
			System.out.println(byId.get());
		}
		
		System.out.println("Record Fetched Successfully.....!");
	}
	
	public void savePerson() {
		
		PersonPK pk=new PersonPK();
		pk.setAdhar(7866868689l);
		pk.setPassNo("G51FRF54D54");
		
		
		Person p=new Person();
		p.setName("Digvijay");
		p.setEmail("Digvijay011@gmail.com");
		
		//here we set our composite primary keys ok
		p.setPerson(pk);
		
		perRepo.save(p);
		
		
	}
	
}
