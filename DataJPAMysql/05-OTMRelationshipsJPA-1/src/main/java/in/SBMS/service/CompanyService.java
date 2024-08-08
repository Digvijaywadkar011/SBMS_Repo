package in.SBMS.service;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.CompanyRepo;
import in.SBMS.entites.Car;
import in.SBMS.entites.Company;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepo companyRepo;

	public void deleteInfo() {

		companyRepo.deleteById(1);
	}

	public void getCompanyInfo() {

		 companyRepo.findById(1);

	}

	public void saveData() {

		Company company = new Company();

		company.setCompanyName("Tata");
		company.setCompanyEmail("tata@gmail.com");

		Car car = new Car();
		car.setCarName("Altroz");
		car.setCarType("Automatic");
		car.setCompany(company);

		Car car1 = new Car();
		car1.setCarName("Punch");
		car1.setCarType("Manual");
		car1.setCompany(company);

		List<Car> asList = Arrays.asList(car, car1);

		company.setCar(asList);

		companyRepo.save(company);
	}
}