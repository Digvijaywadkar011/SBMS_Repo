package in.SBMS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer addId;
	
	private String state;
	
	private String city;
	
	private String country;
	
	private Integer empId;
	
	public Address() {
		
		
	}

	public Address(String state, String city, String country, Integer empId) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.empId = empId;
	}

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	
}
