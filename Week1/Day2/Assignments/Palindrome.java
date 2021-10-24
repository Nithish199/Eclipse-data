package Week1.Day2.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		int length=str.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println(" It is a Palindrome");
		} else {
			System.out.println(" It is not a Palindrome");
		}
	}

}
