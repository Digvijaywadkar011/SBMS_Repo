package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.UserInfo;

public interface UserRepo extends JpaRepository<UserInfo, Integer> {

}
