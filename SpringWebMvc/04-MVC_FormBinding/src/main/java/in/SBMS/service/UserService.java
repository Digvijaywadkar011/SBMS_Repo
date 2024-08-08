package in.SBMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.UserRepo;
import in.SBMS.entities.UserInfo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public boolean saveUser(UserInfo user) {

		userRepo.save(user);
		return user.getId() > 0;
	}

	public List<UserInfo> getUsers() {
		return userRepo.findAll();

	}

}
