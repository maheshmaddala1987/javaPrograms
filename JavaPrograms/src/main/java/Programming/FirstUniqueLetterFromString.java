package Programming;

public class FirstUniqueLetterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="mahesh";
		
		for(int i =0; i<s.length(); i++) {
			
			boolean unique = true;
			for(int j=0; j<s.length(); j++) {
				
				if(i!=j && s.charAt(i) == s.charAt(j)) {
					unique = false;
				}
			}
			
			if(unique) {
				System.out.println(s.charAt(i));
				break;
			}
		}
		
		

	}

}
