package map.TreeMapDemo.Comparable;

import java.util.Set;
import java.util.TreeMap;

public class Client {

	public static void main(String[] args) {
TreeMap tm=new TreeMap();
tm.put(new Employee(107,24,"Anudeep","Male"),new TeamLeader("Nagarjuna","TeamLead"));
tm.put(new Employee(102,23,"Sarath","Male"),new TeamLeader("Nagarjuna","TeamLead"));
tm.put(new Employee(104,22,"Raghavendra","Male"),new TeamLeader("Nagarjuna","TeamLead"));
tm.put(new Employee(101,21,"Lahari","Female"),new TeamLeader("Nagarjuna","TeamLead"));
	Set s=tm.keySet();
	
	for(Object o:s) {
		System.out.println(o+" : "+tm.get(o));
	}
	}
}
