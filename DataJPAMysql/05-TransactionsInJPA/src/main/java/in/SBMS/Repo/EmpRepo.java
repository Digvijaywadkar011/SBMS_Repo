package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
