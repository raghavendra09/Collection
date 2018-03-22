package Lists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

public static void main(String args[]) {
	LinkedList ll=new LinkedList();
	ll.add(10);
	ll.add("Anudeep");
	ll.add("Anudeep");
	ll.add(null);
	ll.add(new Integer(10));//it creates new int value
	System.out.println(ll);

	System.out.println("ForIn:");
	for(Object ob:ll) {
		System.out.println(ob);
	}
	System.out.println("For Loop:");
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i));
	}
	 
	//Iterator used for printing line by line 
	System.out.println("Iterator:");
	Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}