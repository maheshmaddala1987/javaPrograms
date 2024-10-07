package Programming;

public class SwapStringsWithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="mahesh";
		String s1 = "reddy";
		s=s+s1;
		
		//maheshreddy
		System.out.println(s);
		s1 = s.substring(0,s.length()-s1.length());
		s = s.substring(s1.length());
		
		System.out.println(s1);
		System.out.println(s);
		
		
		int i =1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		String str = "testing";
		int count =0;
		char charArray[] = str.toCharArray();
		for(char ch : charArray) {
			count++;
		}
		
		System.out.println(count);

	}

}
