package Task2.comparable.treeS;


import java.util.Collections;
import java.util.TreeSet;

public class set1 {

	public static void main(String[] args) {
		TreeSet al=new TreeSet();
		al.add(new Student(7,"Anudeep",22));
		al.add(new Student(6,"Anudeep",24));
		al.add(new Student(10,"Raju",18));
		al.add(new Student(30,"Ramu",19));
		al.add(new Student(40,"Raju",17));
		al.add(new Student(20,"Samu",16));
		for(Object x:al) {
		System.out.println(x);
		}
	}
}