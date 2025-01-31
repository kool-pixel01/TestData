package ctestcheck;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class trytoexecute {
public static void hasmapiteration() {
	HashMap<Integer,String> hm=new HashMap<Integer, String>();
	
	hm.put(1, "aaa");
	hm.put(2, "bbb");
	hm.put(3, "ccc");
	
	System.out.println(hm.size());
	System.out.println(hm.get(3));
	Iterator itr=hm.entrySet().iterator();
	System.out.println("Using while loop");
	while(itr.hasNext()) {
		Map.Entry me=(Entry) itr.next();
		System.out.println("Keys is "+me.getKey()+" Value is "+me.getValue());
	}
	
	System.out.println("Using for loop");
	for (Map.Entry k : hm.entrySet()) {
		System.out.println("Keys is "+k.getKey()+" Value is "+k.getValue());
		
	}
}
public static void main(String args[]) {
	hasmapiteration();
}

}
