package map.TreeMapDemo.Comparable;

public class Employee implements Comparable{
	private Integer id,age;
	private String name,gender;
	public Employee(Integer id, Integer age, String name, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee s=(Employee) o;
		int nameCompare=this.name.compareTo(s.getName());
		return nameCompare;
	}
	

}
