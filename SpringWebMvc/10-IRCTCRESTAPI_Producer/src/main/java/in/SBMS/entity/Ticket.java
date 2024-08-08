package in.SBMS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ticketNum;
	
	private String name;
	
	private Integer phno;
	
	private String Gender;
	
	private String startFrom;
	
	private String stopTo;
	
	private Double price;
	
	private String date;
	
	private String ticketStatus;
	
	private Integer trainNum;
	
	public Integer getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhno() {
		return phno;
	}

	public void setPhno(Integer phno) {
		this.phno = phno;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(String startFrom) {
		this.startFrom = startFrom;
	}

	public String getStopTo() {
		return stopTo;
	}

	public void setStopTo(String stopTo) {
		this.stopTo = stopTo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Integer getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}


	@Override
	public String toString() {
		return "Ticket [ticketNum=" + ticketNum + ", name=" + name + ", phno=" + phno + ", Gender=" + Gender
				+ ", startFrom=" + startFrom + ", stopTo=" + stopTo + ", price=" + price + ", date=" + date
				+ ", ticketStatus=" + ticketStatus + ", trainNum=" + trainNum + "]";
	}
	
	
	
}