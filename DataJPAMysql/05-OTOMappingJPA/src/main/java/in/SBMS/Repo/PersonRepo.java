package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
