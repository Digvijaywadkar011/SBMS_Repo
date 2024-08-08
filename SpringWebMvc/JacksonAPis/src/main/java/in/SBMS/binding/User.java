package in.SBMS.binding;

public class User {

	private Integer userId;
	private String name;
	private Integer number;

	public User() {

	}

	public User(Integer userId, String name,Integer number) {

		this.userId = userId;
		this.name = name;
		this.number = number;
	}

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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", number=" + number + "]";
	}

}
