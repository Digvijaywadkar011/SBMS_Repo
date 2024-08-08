package in.SBMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.UserRepo;
import in.SBMS.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public boolean saveUser(User user) {

		userRepo.save(user);
		return user.getUserId() > 0;
	}

	public List<User> getUsers() {
		return userRepo.findAll();

	}
	
	
	
	

}
