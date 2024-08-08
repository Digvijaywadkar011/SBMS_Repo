package in.SBMS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "USER_MASTER_TBL")
public class User{

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@NotEmpty(message="Name is Mandatory")
	@Size(min=4, max=8, message="Min 4 and Max 8 chaeracters are allowed")
	private String name;
	
	@Email(message="Enter Valid Email")
	@NotEmpty(message="Email is mandtory")
	private String email;
	
	@NotNull(message="Phno number is Mandatory")
	private Long phno;
	
	private boolean active=true;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phno=" + phno + ", active="
				+ active + "]";
	}

	

	
	
	
	
}
