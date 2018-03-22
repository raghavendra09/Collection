package Task1.comparable.hashS;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class set1 {

	public static void main(String[] args) {
		HashSet al=new HashSet();
		al.add(new Student(7,"Anudeep",22));
		al.add(new Student(6,"Anudeep",24));
		al.add(new Student(10,"Raju",18));
		al.add(new Student(30,"Ramu",19));
		al.add(new Student(40,"Raju",17));
		al.add(new Student(20,"Samu",16));
		ArrayList hs=new ArrayList(al);
		Collections.sort(hs);
		for(Object x:hs) {
		System.out.println(x);
		}
	}
}