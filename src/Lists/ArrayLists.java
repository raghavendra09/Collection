package Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add(10);
al.add("Anudeep");
al.add("Anudeep");
al.add(null);
al.add(new Integer(10));//it creates new int value
System.out.println(al);

System.out.println("ForIn:");
for(Object ob:al) {
	System.out.println(ob);
}
System.out.println("For Loop:");
for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
}
 
//Iterator used for printing line by line 
System.out.println("Iterator:");
Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}