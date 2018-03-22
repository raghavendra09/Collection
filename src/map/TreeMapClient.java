package map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClient {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("107", "Anudeep");
		tm.put("101", "Raghavendra");
		tm.put("102", "Kranthi");
		tm.put("104", "Sarath");
		tm.put("106", "Lahari");
		
	//	System.out.println(tm);
		
Set s=tm.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext()) {
Entry e1=(Entry)itr.next();
System.out.println(e1.getKey()+" : "+e1.getValue());	
}
	}

}
