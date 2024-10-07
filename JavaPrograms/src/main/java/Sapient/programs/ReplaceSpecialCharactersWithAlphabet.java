package Sapient.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceSpecialCharactersWithAlphabet {

	public static void main(String[] args) {

		String str = "tomorrow";

		char ch = 'o';
		int cnt = 0;
		String strnew = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt++;
				for (int j = 0; j < cnt; j++) {
					strnew = strnew + '&';
				}
			} else {
				strnew = strnew + str.charAt(i);
			}

		}
		System.out.println(strnew);
	}

}
