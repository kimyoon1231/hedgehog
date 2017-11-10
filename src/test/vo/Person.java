package test.vo;

public class Person {

	private Integer pno;

	private String name;

	private String indate;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Integer getPno() {
		return pno;
	}

	public void setPno(Integer pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "person [pno=" + pno + ", name=" + name + ", indate=" + indate + "]";
	}
}
