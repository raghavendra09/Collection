package Sets;

import java.util.Iterator;
import java.util.HashSet;

public class HashSets {

public static void main(String args[]) {
	HashSet hs=new HashSet();
	hs.add(10);
	hs.add("Anudeep");
	//not accepts duplicate values
	hs.add("Anudeep");
	hs.add(null);
	hs.add(12.25);
	

	System.out.println(hs);

	System.out.println("ForIn:");
	for(Object ob:hs) {
		System.out.println(ob);
	}
	
	//Iterator used for printing line by line 
	System.out.println("Iterator:");
	Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
}
}