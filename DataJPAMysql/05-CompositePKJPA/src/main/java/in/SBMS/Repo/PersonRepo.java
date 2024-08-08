package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.Person;
import in.SBMS.entities.PersonPK;

public interface PersonRepo extends JpaRepository<Person, PersonPK>{

}
