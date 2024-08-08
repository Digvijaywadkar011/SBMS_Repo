package in.SBMS.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {

	private String name;
	private String email;
	
	@EmbeddedId
	private PersonPK person;

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

	public PersonPK getPerson() {
		return person;
	}

	public void setPerson(PersonPK person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", person=" + person + "]";
	}
}
