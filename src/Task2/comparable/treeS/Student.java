package Task2.comparable.treeS;

public class Student implements Comparable{
private Integer id;
private String name;
private Integer age;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public Student(Integer id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}
@Override
public int compareTo(Object o) {
	Student s=(Student) o;
	if(this.name.equals(s.getName())) {
	int ageCompare=this.age.compareTo(s.getAge());
	return ageCompare;
	}
	int nameCompare=this.name.compareTo(s.getName());
	
	return nameCompare;
}
}