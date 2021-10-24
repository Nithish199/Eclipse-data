package Week3.Day1Assignments;

public class ComparingAString {

	public static void main(String[] args) {
		String str=new String("Kutty");
		String str2=new String("Kutty");
		if(str==str2) {
			System.out.println("Same Text");
		}
		else {
			System.out.println("Different Text");
		}
		System.out.println("using equality operator");
		/*
		 * equals method compares wheather the value of the strings is equals and not the object itself
		 */
		if(str.equals(str2)) {
			System.out.println("Same Text");
		}
		else {
			System.out.println("Different Text");
		}
	}

}
