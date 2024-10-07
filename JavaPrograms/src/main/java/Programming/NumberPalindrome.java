package Programming;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 121;

		int r;
		int sum = 0;

		int temp = num;

		while (num > 0) {
			r = num % 10;
			System.out.println(r);
			System.out.println("------------------" + sum * 10);
			sum = (sum * 10) + r;
			System.out.println("after sum:"+sum);
			num = num / 10;
		}

		if (temp == sum)
			System.out.println("palindrome");
		else
			System.out.println("not a prime");

	}

}
