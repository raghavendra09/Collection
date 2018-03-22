package Task.comparator.arryL;

import java.util.ArrayList;
import java.util.Collections;

public class list1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Student(7,"Anudeep",22));
		al.add(new Student(6,"Anudeep",24));
		al.add(new Student(10,"Raju",18));
		al.add(new Student(30,"Ramu",19));
		al.add(new Student(40,"Raju",17));
		al.add(new Student(20,"Samu",20));
		Collections.sort(al,new AgeComparator());
		for(Object x:al) {
		System.out.println(x);
		}
	}

}
