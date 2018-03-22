package map.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class task {

	public static void main(String[] args) {
String s="Anudeep";
char ch = 0;
ArrayList al=new ArrayList();
LinkedHashMap hm=new LinkedHashMap();

for(int i=0;i<s.length();i++) {
	ch=s.charAt(i);
	al.add(ch);
}
	for(Object o:al) {
		if(hm.containsKey(o)) {
			int c=(int)hm.get(o)+1;
			hm.put(o, c);
		}
		else {
			hm.put(o, 1);
		}
	}
	System.out.println(hm);
	}

}
