package opentext.programs;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HasttableWithEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(1, "mahesh");
		ht.put(2, "prasanth");
		ht.put(3, "siva");
		
		Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
		
		hashtable.put(4, "mahesh");
		hashtable.put(5, "prasanth");
		hashtable.put(3, "siva");
		
		ht.putAll(hashtable);
		System.out.println(ht);
		
		
		Enumeration e = ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	    for(Map.Entry<Integer, String> entry : ht.entrySet()) {
	    	System.out.print(entry.getKey()+" -> "+entry.getValue()+" ");
	    }
	
	    for(Integer keys : ht.keySet()) {
	    	System.out.println(keys+" "+ht.get(keys));
	    }

	}

}
