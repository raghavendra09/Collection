package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClient {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
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
