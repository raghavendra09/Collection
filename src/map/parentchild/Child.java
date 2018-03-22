package map.parentchild;

public class Child {
	private String company, gender, designation;
	private Integer salary;
	
	public Child(String company, String gender, String designation, Integer salary) {
		super();
		this.company = company;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Child [company=" + company + ", gender=" + gender + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	

}
