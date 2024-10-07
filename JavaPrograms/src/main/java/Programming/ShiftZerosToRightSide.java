package Programming;

import java.util.Arrays;

public class ShiftZerosToRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 0, 2, 0, 0, 5, 0, 0, 7, 8 };

		if (a.length == 1) {
			System.out.println(a);
		}

		int newArray[] = new int[a.length];

		int count = 0;

		for (int number : a) {
			if (number != 0) {
				newArray[count] = number;
				count++;
			}
		}

		System.out.println(Arrays.toString(newArray));

	}

}
