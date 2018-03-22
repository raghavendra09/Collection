package Sets;

import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
			TreeSet ts=new TreeSet();
			ts.add(1237);
			ts.add(1235);
			ts.add(1236);
			ts.add(1234);
			
			//ts.add(null);
			//null pointer exception occurs because tree set dont accept null values
		/*	ts.add("Anudeep");
			 ts.add("Raghavendra");
			 ts.add("Kranthi");
			 ts.add("Sarath");*/
			System.out.println(ts);
				}
	}