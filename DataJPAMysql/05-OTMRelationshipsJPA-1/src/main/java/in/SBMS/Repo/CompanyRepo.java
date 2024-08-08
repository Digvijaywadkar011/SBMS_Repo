package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entites.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
