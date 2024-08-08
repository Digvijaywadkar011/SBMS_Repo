package in.SBMS.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {
	
	private Long adhar;
	private String passNo;
	@Override
	public String toString() {
		return "PersonPK [adhar=" + adhar + ", passNo=" + passNo + "]";
	}
	public Long getAdhar() {
		return adhar;
	}
	public void setAdhar(Long adhar) {
		this.adhar = adhar;
	}
	public String getPassNo() {
		return passNo;
	}
	public void setPassNo(String passNo) {
		this.passNo = passNo;
	}

}
