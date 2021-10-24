package Week1.Day2.Assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class Of Automation $$";
		int letter=0,space=0,num=0,specialchar=0;
		char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLetter(charArray[i])) {
				letter++;
			}
			else if(Character.isDigit(charArray[i])) {
				num++;
			}
			else if(Character.isSpaceChar(charArray[i])) {
				space++;
			}
			else
			{
				specialchar++;
			}
		}
		System.out.println(" $$ Welcome to 2nd Class Of Automation $$");
		System.out.println("Letter : "+letter);
		System.out.println("Number : "+num);
		System.out.println("Space : "+space);
		System.out.println("SpecialCharacter : "+specialchar);
	}

}
