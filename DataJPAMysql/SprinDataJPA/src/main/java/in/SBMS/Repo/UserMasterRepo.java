package in.SBMS.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import in.SBMS.entity.UserMasterEntity;
import jakarta.transaction.Transactional;

public interface UserMasterRepo extends CrudRepository<UserMasterEntity, Integer>{
	
	//select * from user_master where age=?;
	public List<UserMasterEntity> findByAge(Integer age);
	
	//select * from user_master where age>=?;
	public List<UserMasterEntity> findByAgeGreaterThanEqual(Integer age);
	
	//select * from user_master where city in (?,?,?);
	public List<UserMasterEntity> findByCityIn(List<String> citys);
	
	//select * from user_master where city=? and age=? and gender?;
	public List<UserMasterEntity> findByCityAndAgeAndGender(String city,Integer age,String gender);
	
	//select user_email from user_master where city=:city;
	@Query(value="select email from UserMasterEntity where city=:city")
	public List<String> getEmails(String city); 
	
	@Query(value="from UserMasterEntity")
	public List<UserMasterEntity> getAllUsers();
	
	@Query(value="select * from user_master",nativeQuery = true)
	public List<UserMasterEntity> getAllUserSql();
	
	@Query(value="update user_master set user_city='mumbai' where user_id=:userid",nativeQuery = true)
	@Transactional
	@Modifying
	public void updateUser(Integer userid);
	
	@Modifying
	@Transactional
	@Query(value="delete from user_master where user_name=:username",nativeQuery = true)
	public void deleteUser(String username);
	
	
}
