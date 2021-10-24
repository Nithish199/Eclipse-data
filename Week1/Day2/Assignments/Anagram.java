package Week1.Day2.Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String test1="stops";
		String test2="potss";
		String a="";
		String b="";
		int length1=test1.length();
		int length2=test2.length();
		if(length1==length2) {
			char[] charArray1 = test1.toCharArray();
			char[] charArray2 = test2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);{
			System.out.println(charArray1);
			System.out.println(charArray2);
		}
		a=String.valueOf(charArray1);
		b=String.valueOf(charArray2);
		}
		if(a.equals(b)) {
			System.out.println(" It has a same values ");
		}
		else {
			System.out.println(" It has a Different values ");
		}
	}

}
