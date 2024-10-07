package Programming;

import java.security.cert.CertPathParameters;
import java.util.StringTokenizer;

public class ConcatenateTwoStringsCharByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="mahesh";
		String s1 = "reddy";
		
		StringBuilder result = new StringBuilder();
		
		for(int i =0;i<s.length() || i< s1.length();i++) {
			if(i<s.length()) {
				result.append(s.charAt(i));
			}
			
			if(i<s1.length()) {
				result.append(s1.charAt(i));
			}
		}
		
		System.out.println(result.toString());
		
		System.out.println("++++++++++++++++++++");
		
		String str = "This is mahesh reddy";
		
        String rev[] = str.split(" ");
        
        String reverseString = "";
        
        for (int i = 0; i < rev.length; i++) 
        {
            String word = rev[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&7:"+reverseString);
		
		
		StringTokenizer st = new StringTokenizer(str, " ");

		// strReverseLine is the function used to reverse a string.
		String strReversedLine = "";
		try
		{
			while(st.hasMoreTokens())
			{
				strReversedLine = st.nextToken() + " " + strReversedLine;
			}
			System.out.println("Reversed string by word is : " + strReversedLine);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("**************************************");
		
		String toBeCapped = "i want this sentence capitalized";

		String[] tokens = toBeCapped.split("\\s");
		String toBeCap = "";

		for(int i = 0; i < tokens.length; i++){
		    char capLetter = Character.toUpperCase(tokens[i].charAt(0));
		    toBeCap +=  " " + capLetter + tokens[i].substring(1);
		}
		toBeCap = toBeCap.trim();
		
		System.out.println("--------------------"+toBeCap);
		
		
	}

}
