public class Q4_Person {
	private int membership_number;
	private String name;
	private String phone_number;
	private String address;

	public Q4_Person(int membership_number, String name, String phone_number, String address) {
		super();
		this.membership_number = membership_number;
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}

	public Q4_Person() {
	}

	public int getMembership_number() {
		return membership_number;
	}

	public void setMembership_number(int membership_number) {
		this.membership_number = membership_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println("번호:" + membership_number + "\t이름:" + name + "\t\t전화번호:" + phone_number + "\t주소:" + address);
	}
} // 끝 