package Programming;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		int n2 =1;
		int n3;
		int i =0;
		System.out.println(n1);
		System.out.println(n2);
		for(i = 2 ; i<10;i++) {
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}