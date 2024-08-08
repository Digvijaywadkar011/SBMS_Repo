package in.SBMS.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.UserMasterRepo;
import in.SBMS.entity.UserMasterEntity;

@Service
public class UserMasterService {

	@Autowired
	private UserMasterRepo userRepo;
	
	public void deleteUser() {
		
		userRepo.deleteUser("Sumit");
	}
	
	public void updateByTranscModity() {
		
		
		userRepo.updateUser(102);
	}
	
	public void CustomQuerys() {
		//List<String> emails = userRepo.getEmails("Pune");
		
		//List<UserMasterEntity> allUsers = userRepo.getAllUsers();
		
		List<UserMasterEntity> allUsersSql = userRepo.getAllUserSql();
		allUsersSql.forEach(e ->{System.out.println(e);});
	}
	
	
	
	

	public void QueryFindby() {
		
		List<UserMasterEntity> byAge = userRepo.findByAge(23);
		byAge.forEach(e -> {System.out.println(e);});
		
		List<UserMasterEntity> byAgeGreaterThanEqual = userRepo.findByAgeGreaterThanEqual(30);
		byAgeGreaterThanEqual.forEach(e ->{System.out.println(e);});
		
		
	List<UserMasterEntity> byCityIn = userRepo.findByCityIn(Arrays.asList("Pune","Mumbai","USA"));
		byCityIn.forEach(e -> {System.out.println(e);});
		
		
		List<UserMasterEntity> byCityAndAgeAndGender = userRepo.findByCityAndAgeAndGender("USA", 25, "Male");
		byCityAndAgeAndGender.forEach(e ->{System.out.println(e);});
		
		
	}
	
	public void totalRecord() {

		long count = userRepo.count();
		System.out.println("Total Record present in the User_Master :: " + count);
		System.out.println("Record Presence ? :" + userRepo.existsById(102));

	}

	public void deleteByMethods() {

		userRepo.deleteById(104);

		userRepo.deleteAllById(Arrays.asList(1000, 222, 103));

		userRepo.deleteAll();

	}

	public void getUser() {

		/*
		 * Optional<UserMasterEntity> findById = userRepo.findById(102); if
		 * (findById.isPresent()) { System.out.println(findById.get()); } else {
		 * System.out.println("No Record Present"); }
		 */

		// For all records fetched with IDs(Primary key)

		// Iterable<UserMasterEntity> getAllUser =
		// userRepo.findAllById(Arrays.asList(101,102,103));

		// getAllUser.forEach(e ->{ System.out.println(e); });

		Iterable<UserMasterEntity> all = userRepo.findAll();

		all.forEach(e -> {
			System.out.println(e);
		});

	}

	
	  public void insertUserMasterRecord() {
	  
	  UserMasterEntity entity = new UserMasterEntity();
	  
	  entity.setId(101); entity.setName("Digvijay");
	  entity.setEmail("Digvijay@gmail.com"); entity.setGender("Male");
	  entity.setCity("Pune"); entity.setAge(23);
	  
	  userRepo.save(entity);
	  
	  }
	 

	public void insertMultipleRecords() {
		UserMasterEntity entity = new UserMasterEntity();

		UserMasterEntity entity1 = new UserMasterEntity();

		UserMasterEntity entity2 = new UserMasterEntity();

		entity.setId(102);
		entity.setName("Shrikant");
		entity.setEmail("Shrikant@gmail.com");
		entity.setGender("Male");
		entity.setCity("USA");
		entity.setAge(25);

		entity1.setId(103);
		entity1.setName("Sumit");
		entity1.setEmail("Sumit@gmail.com");
		entity1.setGender("Male");
		entity1.setCity("Pune");
		entity1.setAge(21);

		entity2.setId(104);
		entity2.setName("Sanil");
		entity2.setEmail("Sanil@gmail.com");
		entity2.setGender("Male");
		entity2.setCity("Mumbai");
		entity2.setAge(30);

		List<UserMasterEntity> entityUser = Arrays.asList(entity, entity1, entity2);

		userRepo.saveAll(entityUser);
	}
}
