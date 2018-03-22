package map.parentchild;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(new Parent("Anudeep","Challa","Hyd",24), new Child("Stigentech","Male","Software Engineer",10000));
		lm.put(new Parent("Kranthi","Gurram","Hyd",24), new Child("Stigentech","Male","Software Engineer",10000));
		lm.put(new Parent("Raghavendra","Tirunagari","Hyd",26), new Child("Stigentech","Male","Software Engineer",10000));
		lm.put(new Parent("Sarath","Potluri","Hyd",25), new Child("Google","Male","Software Engineer",30000));
		
		Set s=lm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Entry e1=(Entry)itr.next();
			System.out.println(e1.getKey()+" : "+e1.getValue());
		}
		System.out.println("-------------------------");
		Set k=lm.keySet();
		for(Object o:k)
			System.out.println(o+" : "+lm.get(o));
	}

}
