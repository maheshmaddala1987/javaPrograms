package Programming;

import java.util.Arrays;

public class StringArrayReverse {

	public static void main(String[] args) {
		
		String input = "This is mahesh reddy";
		String[] words = input.split("\\s+");
		String[] reversed = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			reversed[words.length - i - 1] = words[i];
		}

		System.out.println(Arrays.toString(reversed));

	}

}
