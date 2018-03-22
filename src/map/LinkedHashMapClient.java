package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapClient {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		
		hm.put("Name", "Anudeep");
		hm.put("Age","26");
		hm.put("Designation","Software Engineer");
		hm.put("Gender","Male");
		hm.put("City","Hyd");
		
		System.out.println(hm);
		System.out.println();
		System.out.println("Accessing by Entry");
		//converting map to set because map does not accept iterator
		Set s=hm.entrySet(); 
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Entry e1=(Entry) itr.next();
			System.out.println(e1.getKey()+" : "+e1.getValue());
			
//			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Accessing by Key");
		Set keys=hm.keySet();
		for(Object o:keys) {
			System.out.println(o+" : "+hm.get(o));
		}

	}

}
