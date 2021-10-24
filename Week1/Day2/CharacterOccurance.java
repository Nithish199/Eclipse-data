package Week1.Day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		int count=0;
		String str="Welcome To Chennai";
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='n') {
				//count=count+1
				count++;
			}
		}
		System.out.println(count);

	}

}
