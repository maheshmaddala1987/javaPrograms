package Programming;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 20;
		
		boolean b = true;
		
		for(int i = 2; i<n/2;i++) {
			if(n%i==0) {
				b=false;
			}
			
			
		}
		
		if(b) {
			System.out.println("the given number is prime");
			
			}else {
				System.out.println("not a prime");
		}

	}

}
