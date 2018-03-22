package map.TreeMapDemo.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		int nameCompare=e1.getName().compareTo(e2.getName());
		return nameCompare;
	}
}