package TreeMapMethods;

import java.util.TreeMap;

public class TreeMapClient {

	public static void main(String[] args) {
TreeMap tm=new TreeMap();
TreeMap tm1=new TreeMap();

tm.put(100, "Sarath");
tm.put(10, "Raghavendra");
tm.put(50, "Kranthi");
tm.put(70, "Anudeep");
tm.put(40, "Satish");

tm1.putAll(tm);

tm1.put(35, "Lahari");
tm1.put(25, "Revenath");
tm1.put(45, "Abhi");
tm1.put(75, "Mahesh");
System.out.println("......Tree Map Methods....");

System.out.println(tm);

System.out.println(tm1);

System.out.println("Size : "+tm1.size());

tm1.remove(25);
System.out.println("After Removing 25 : "+tm1);

System.out.println("After Removing key=25 : "+tm1.get(25));//as key=25 is removed it returns null

System.out.println("After Clone : "+tm.clone());

//containskey method
if(tm1.containsKey(40)) {
	System.out.println("Found: "+tm1.get(40));
}
else {
	System.out.println("Not Found");
}
	
//containsvalue method
if(tm.containsValue("Anudeep")) {
	System.out.println("Found : "+tm.get(70));
}
else {
	System.out.println("Not Found");
}	

tm.clear();
System.out.println("After Clearing tm : "+tm);	

System.out.println("......Tree Map-Sorted Map Methods.......");

tm1.comparator();
System.out.println("Comparator : "+tm1);

System.out.println("Entry Set : "+tm1.entrySet());

System.out.println("First Key : "+tm1.firstKey());

System.out.println("Last Key : "+tm1.lastKey());

System.out.println("Values : "+tm1 .values());

System.out.println("Keys : "+tm1.keySet());

System.out.println("HeadMap : "+tm1.headMap(45));

System.out.println("SubMap : "+tm1.subMap(35, 75));

System.out.println("TailMap : "+tm1.tailMap(45));


System.out.println("......Tree Map-Navigable Map Methods....");

System.out.println("Ceiling Entry : "+tm1.ceilingEntry(12));//if given key is present then it returns the given key

System.out.println("Floor Entry : "+tm1.floorEntry(12));//if given key is present then it returns the given key

System.out.println("Ceiling Key : "+tm1.ceilingKey(32));

System.out.println("Floor Key : "+tm1.floorKey(32));

System.out.println("Descending Key Set : "+tm1.descendingKeySet());

System.out.println("Descending Map : "+tm1.descendingMap());

System.out.println("First Entry : "+tm1.firstEntry());

System.out.println("Last Entry : "+tm1.lastEntry());

System.out.println("Head Map(Navigable Map) : "+tm1.headMap(45, true));

System.out.println("Sub Map(Navigable Map) : "+tm1.subMap(35, true, 75, true));

System.out.println("Tail Map(Navigable Map) : "+tm1.tailMap(50, true));

System.out.println("Higher Entry : "+tm1.higherEntry(50));

System.out.println("Lower Entry : "+tm1.lowerEntry(50));

System.out.println("Higher Key : "+tm1.higherKey(50));

System.out.println("Lower Key : "+tm1.lowerKey(50));

System.out.println("Navigable Key Set : "+tm1.navigableKeySet());

System.out.println("Poll First Entry : "+tm1.pollFirstEntry());//it removes this element when you call same first entry the next element is printed
System.out.println("Again Poll First Entry : "+tm1.pollFirstEntry());

System.out.println("Poll Last Entry : "+tm1.pollLastEntry());
System.out.println("Again Poll Last Entry : "+tm1.pollLastEntry());//it removes this element when you call same last entry the next preceding element is printed

}
}