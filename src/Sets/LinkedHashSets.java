package Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

public static void main(String args[]) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(10);
	lhs.add("Anudeep");
	//not accepts duplicate values
	lhs.add("Anudeep");
	lhs.add(null);
	lhs.add(12.25);
	

	System.out.println(lhs);

	System.out.println("ForIn:");
	for(Object ob:lhs) {
		System.out.println(ob);
	}
	
	//Iterator used for printing line by line 
	System.out.println("Iterator:");
	Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
}
}