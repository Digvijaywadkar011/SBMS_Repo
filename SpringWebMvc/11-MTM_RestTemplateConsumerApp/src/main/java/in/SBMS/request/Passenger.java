package in.SBMS.request;

public class Passenger {

	private String name;

	private Integer phno;

	private String Gender;

	private String startFrom;

	private String stopTo;

	private String date;

	private Integer trainNum;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}

}
