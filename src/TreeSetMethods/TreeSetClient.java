package TreeSetMethods;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClient {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		TreeSet ts1=new TreeSet();

		System.out.println("......Tree Set Methods....");

		ts.add(11);
		ts.add(3);
		ts.add(1);
		ts.add(9);
		ts.add(7);
		ts.add(5);
		System.out.println("After adding Elements : "+ts);
		
		ts1.addAll(ts);
		ts1.add(13);
		ts1.add(15);
		ts1.add(17);
		ts1.add(19);
		System.out.println("After add all and adding elements : "+ts1);
		
		System.out.println("After Clone : "+ts1.clone());
		
		if(ts1.contains(13)) {
			System.out.println("Contains 13");
		}
		else {
			System.out.println("Not Contains 13");
		}
		
		System.out.println("First Element : "+ts1.first());
		
		System.out.println("Last Element : "+ts1.last());
		
		System.out.println("Size : "+ts1.size());
		
		ts1.remove(13);
		System.out.println("After Remove 13 : "+ts1);
		
		ts1.iterator();
		System.out.println("Iterator : "+ts1);
		
		ts1.clear();
		System.out.println("After Clear : "+ts1);
		
		if(ts1.isEmpty()) {
			System.out.println("ts1 is empty");
		}
		else {
			System.out.println("ts1 is not empty");
		}
			
		
System.out.println("......Tree Set-Sorted Set Methods....");
		System.out.println("First Element : "+ts.first());
		
		System.out.println("Last Element : "+ts.last());
		
		System.out.println("HeadSet : "+ts.headSet(9));
		
		System.out.println("TailSet : "+ts.tailSet(3));
		
		System.out.println("SubSet : "+ts.subSet(3, 9));
		
		ts.comparator();
		System.out.println("After Comparator : "+ts);
		
System.out.println("......Tree Set-Navigable Set Methods....");
		System.out.println("Ceiling : "+ts.ceiling(3));//if given value is present in the list then returns the actual value given
		System.out.println("Again Ceiling : "+ts.ceiling(4));
		
		System.out.println("Floor : "+ts.floor(7));
		System.out.println("Again Floor : "+ts.floor(6));
		
		System.out.println("HeadSet(Navigable) : "+ts.headSet(11, false));
		System.out.println("HeadSet(Navigable) : "+ts.headSet(11, true));//it also includes the given value
		
		System.out.println("TailSet(Navigable) : "+ts.tailSet(3, false));
		System.out.println("TailSet(Navigable) : "+ts.tailSet(3, true));
		
		System.out.println("PollFirst : "+ts.pollFirst());
		//it removes after retrieving the first element
		System.out.println("Again PollFirst : "+ts.pollFirst());
		
		System.out.println("PollLast : "+ts.pollLast());
		//it removes after retrieving the last element
		System.out.println("Again PollLast : "+ts.pollLast());
		
		System.out.println("Higher : "+ts.higher(5));
		System.out.println("Remaining Elements in Set : "+ts);
		
		System.out.println("Lower : "+ts.lower(7));
		
		Iterator itr=ts.descendingIterator();
		System.out.println("Tree set data in descending order: ");     
		   while (itr.hasNext()){
		   System.out.println(itr.next() + " ");
		   }

		   
		System.out.println("Descending Set : "+ts.descendingSet());	

	}

}
