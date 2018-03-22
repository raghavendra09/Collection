package Task.comparator.arryL;

import java.util.Comparator;

public class AgeComparator implements Comparator {
	@Override
	public int compare(Object o1,Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		if(s1.getName().equals(s2.getName())) {
		int ageCompare=s1.getAge().compareTo(s2.getAge());
		return ageCompare;
		}
		int nameCompare=s1.getName().compareTo(s2.getName());
		
		return nameCompare;
	}
}