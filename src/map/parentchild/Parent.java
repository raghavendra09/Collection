package map.parentchild;

public class Parent {
	private String fname;
	private String lname;
	private String address;
	private Integer age;
	
	public Parent(String fname, String lname, String address, Integer age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Parent [fname=" + fname + ", lname=" + lname + ", address=" + address + ", age=" + age + "]";
	}

}
