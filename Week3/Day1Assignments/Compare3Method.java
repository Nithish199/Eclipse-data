package Week3.Day1Assignments;

public class Compare3Method {
	public static void main(String[] args) {
String str1="I am Learning Java";
String str2="I am learning java";
System.out.println("using equal to Operator");
if(str1==str2) {
	System.out.println("Equal");
}
else {
	System.out.println("Not equal");
}
System.out.println("using equals() operator");
	if(str1.equals(str2)) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	} 
	System.out.println("using equalsignorecase");
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	}
}
