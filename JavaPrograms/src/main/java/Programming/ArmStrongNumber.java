package Programming;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;

		int r, temp;
		int sum = 0;

		temp = num;

		while (num > 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}

		if (temp == sum)
			System.out.println("given number is armstrong");
		else
			System.out.println("not a armstrong");
	}

}
