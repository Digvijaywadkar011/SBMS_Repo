package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.Address;

public interface AddRepo extends JpaRepository<Address, Integer> {

}
