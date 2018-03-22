package Sets.TreeSetDemo.Comparator;

import java.util.TreeSet;

public class TreeSetCustomer {

	public static void main(String[] args) {
TreeSet ts=new TreeSet(new NameComparator());
ts.add(new Customer(1237,"Anudeep",24,"Knr"));
ts.add(new Customer(1235,"Raghavendra",28,"Hyd"));
ts.add(new Customer(1236,"Kranthi",30,"Sdpt"));
ts.add(new Customer(1234,"Sarath",20,"Sec"));
System.out.println(ts);
	}

}
