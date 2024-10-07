package Programming;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterOccurrenceCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "testingg";
			
	    Map<Character,Integer> map =new HashMap<Character,Integer>();
	    char charArray[] = s.toCharArray();
	    
	    for(char ch : charArray) {
	    	if(map.containsKey(ch)) {
	    		map.put(ch, map.get(ch)+1);
	    	}else {
	    		map.put(ch,1);
	    	}
	    }
	    
	    System.out.println(map);

	}

}
