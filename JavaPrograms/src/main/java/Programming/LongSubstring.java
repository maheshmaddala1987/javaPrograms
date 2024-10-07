package Programming;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongSubstring {

	 public static void lengthOfLongestSubstring(String s) {
	        String longestSubstring = null;
	        int lengthOfLongestSubstring = 0;
	        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	        char[] arr = s.toCharArray();
	        int start = 0;

	        for (int i = 0; i < arr.length; i++) {
	            char ch = arr[i];
	            if (map.containsKey(ch)) {
	                start = Math.max(start, map.get(ch) + 1);
	            }
	            map.put(ch, i);

	            if (i - start + 1 > lengthOfLongestSubstring) {
	                lengthOfLongestSubstring = i - start + 1;
	                longestSubstring = s.substring(start, i + 1);
	            }
	        }
	        System.out.println(lengthOfLongestSubstring);
	        System.out.println(longestSubstring);
	    }

	    public static void main(String[] args) {
	        lengthOfLongestSubstring("rsdhghkhjdrsbng");
	    }

}
