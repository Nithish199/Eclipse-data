package Week3.Day1Assignments;

public class Index {
public static void main(String[] args) {
	String text= "Java Exercise";
	char[] charArray=text.toCharArray();
	for(int i=0;i<charArray.length;i++) {
		if(charArray[i]=='E'|| charArray[i]=='s') {
			System.out.println(i);
		}
	}
	
}
}
