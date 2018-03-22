package RetrievingData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class RetrievingElements {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(101);
		al.add(1011);
		al.add(10111);
		al.add(101111);
		al.add(1011111);
		System.out.println("----using normal sop statement--");
		System.out.println(al);
		System.out.println("----using for loop--");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----using forin loop--");
		for(Object o:al) {
			System.out.println(o);
		}
		System.out.println("----using enumerator--");
		Enumeration e=Collections.enumeration(al);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("----using iterator--");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----using list iterator--");
		ListIterator litr=al.listIterator();
		System.out.println("----Forward Direction--");
		while(litr.hasNext()) {
			
			System.out.println(litr.next());
		}
		System.out.println("----Backward Direction--");//it can't possible without forward direction
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
				
	}

}
