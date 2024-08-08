package in.SBMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.SBMS.Repo.UserMasterRepo;
import in.SBMS.service.UserMasterService;

@SpringBootApplication
public class SprinDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SprinDataJpaApplication.class, args);
		
		/*
		 * UserMasterRepo userMasterRepo = context.getBean(UserMasterRepo.class);
		 * 
		 * System.out.println("Repository Implemaintation class name"+userMasterRepo.
		 * getClass().getName());
		 */
		
		UserMasterService service = context.getBean(UserMasterService.class);
		
		//service.insertUserMasterRecord();
		//service.insertMultipleRecords();
		//service.getUser();
		//service.totalRecord();
		//service.deleteByMethods();
		//service.QueryFindby();
		//service.CustomQuerys();
		//service.updateByTranscModity();
		service.deleteUser();
		
		
		
		System.out.println("Done JPA Crud operartions");
		
		
		
	}

}
