package Programming;

public class ReverseLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = "What is going on".split(" ");
		String dest = "";
		for (int n = str.length - 1; n >= 0; n--) {
			dest += str[n] + " ";
		}
		System.out.println(dest);

	}

}
