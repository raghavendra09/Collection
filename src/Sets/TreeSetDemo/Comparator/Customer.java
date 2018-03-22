package Sets.TreeSetDemo.Comparator;

public class Customer{

	private Integer accNo;
	private String name;
	private Integer age;
	private String address;
	
	public Customer(Integer accNo, String name, Integer age, String address) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	

}