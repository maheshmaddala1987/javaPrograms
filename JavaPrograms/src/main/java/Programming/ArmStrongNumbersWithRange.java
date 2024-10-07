package Programming;

import java.util.Scanner;

public class ArmStrongNumbersWithRange {
	
	public static boolean isArmstrong(int number) {
		int n= number;
		int r =0, sum =0;
		int length1 = String.valueOf(number).length();
		//System.out.println("length value is:"+length1);
		
		while(n > 0) {
			r = n%10;
            sum = sum + (int)Math.pow(r, length1);
            n = n/10;
		}
	    
		if(sum == number) {
			return true;
		}else {
			return false;
		}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter starting number");
		int startingNumber = sc.nextInt();
		
		System.out.println("enter ending number");
		int endingNumber = sc.nextInt();
		
		for(int i = startingNumber;i<=endingNumber;i++) {
		    if(isArmstrong(i)) {
		    	System.out.println(i);
		    }
		}
		
	
		
	}

}
