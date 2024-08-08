package in.SBMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.AddRepo;
import in.SBMS.Repo.EmpRepo;
import in.SBMS.entities.Address;
import in.SBMS.entities.Employee;
import jakarta.transaction.Transactional;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddRepo addRepo;

	@Transactional(rollbackOn = Exception.class)
	public void saveEmp() {
		
		Employee emp=new Employee("Digvijay",50000.00);
		
		empRepo.save(emp);
		
		//int i=10/0;
		
		Address add=new Address("MH","PUNE","INDIA",emp.getEmpId());
		
		addRepo.save(add);
	}
}
