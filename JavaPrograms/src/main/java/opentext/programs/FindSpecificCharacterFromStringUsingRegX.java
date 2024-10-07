package opentext.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecificCharacterFromStringUsingRegX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile("es");

		Matcher m = pattern.matcher("maheshreddy");

		  while (m.find())
			  
	            // Print starting and ending indexes
	            // of the pattern in the text
	            // using this functionality of this class
	            System.out.println("Pattern found from "
	                               + m.start() + " to "
	                               + (m.end() - 1));
	    }
		
		
		

	}


