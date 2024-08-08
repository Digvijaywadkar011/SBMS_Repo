package in.SBMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.SBMS.service.CompanyService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		CompanyService service = context.getBean(CompanyService.class);
		
		//service.saveData();
		service.getCompanyInfo();
	}

}
