public class Q4_Person_2 {
	private int membership_number;
	private String name;
	private String phone_number;
	private String address;

	public Q4_Person_2(int membership_number, String name, String phone_number, String address) {
		super();
		this.membership_number = membership_number;
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}

	public Q4_Person_2() {
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
		System.out.printf("membership_number: %-10dname: %-15sphone_number: %-20saddress: %-30s\n", membership_number, name, phone_number, address);
	}
}