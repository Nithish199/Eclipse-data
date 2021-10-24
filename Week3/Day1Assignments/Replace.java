package Week3.Day1Assignments;

public class Replace {
public static void main(String[] args) {
	String str= "I am working with Java8";
	String str1= str.replaceAll("8","11");
	System.out.println(str1);
	System.out.println();
	for(int i=5;i<+14;i++) {
		char a=str.charAt(i);
		System.out.println("Char at"+i+"Index is :"+a);
	}
	
}
}
