package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
