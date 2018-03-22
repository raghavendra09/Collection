package Sets.TreeSetDemo.Comparable;


public class Customer implements Comparable{

	private Integer accNo;
	private String name;
	private Integer age;
	private String address;
	

public void setAccNo(int accNo) {
	this.accNo=accNo;
}
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public void setAddress(String address) {
	this.address=address;
}
public int getAccNo() {
	return accNo;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getAddress() {
	return address;
}

public Customer(Integer accNo, String name, Integer age, String address) {
	super();
	this.accNo = accNo;
	this.name = name;
	this.age = age;
	this.address = address;
}
/*public int compareTo(Object o) {
	Customer c=(Customer) o;
	int nameCompare=this.name.compareTo(c.getName());
	return nameCompare;
	
}
*/public int compareTo(Object a) {
	Customer c1=(Customer) a;
	int ageCompare=this.age.compareTo(c1.getAge());
	return ageCompare;
	
}

@Override
public String toString() {
	return "Customer ["+ accNo +" ,"+ name +" ,"+ age +" ,"+ address+"]";
}
}
