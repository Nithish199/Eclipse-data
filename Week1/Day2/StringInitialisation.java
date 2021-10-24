package Week1.Day2;

public class StringInitialisation {

	public static void main(String[] args) {
		// Literals (data)
		String strTest = "Welcome To TestLeaf";
		// New operator
		String strTest1 = new String("Amma");
		// New is allocated and stored
		// 1. String length = Method
		int lengthstr = strTest.length();
		//String lengthstr = null;
		System.out.println("Length = " + lengthstr);
		// space also takes the value in length. It is also a character
		// 2. Find the character in a string
		System.out.println(strTest.charAt(5));
		// 3. Get the position of a character in string
		int indexOf = strTest.indexOf('e');
		System.out.println(" Index :" + indexOf);
		// 4. Get the last positionof a charater of a string
		int lastIndexOf = strTest.lastIndexOf('e');
		System.out.println("Lastindex: " + lastIndexOf);
		// 5. Convert a string to a character array
		System.out.println(" Complete string is :" + strTest);
		// Welcome to TestLeaf
		char[] charArray = strTest.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray[" + i + "]: " + charArray[i]);
		}
		// 6. Convert a string to word
		String[] split = strTest.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(" Split [" + i + "] :" + split[i]);
		}
		// 7. Get a part of the string
		String substring = strTest.substring(8);
		System.out.println(" substring :" + substring);
		String substring2 = strTest.substring(8, 12);
		// Start index : inclusive 0,1,2
		// End index : exclusive
		System.out.println(" substring2 :" + substring2);
		// 8. Replace a character
		String replace = strTest.replace('e', 'E');
		System.out.println("Replace string : " + replace);
		// 9. Replace all the integers ,non integers
		String str1 = "TestLeaf 102839";
		// d = represent integers
		// D = represent non integers
		String replaceAll = str1.replaceAll("[\\D]"," ");
		String replaceAll2 = str1.replaceAll("[\\d]"," ");
		System.out.println(replaceAll);
		System.out.println(replaceAll2);
		// 10. Compare Two string
		// == Compare the memory location of the string
		// equals() : Compare the content of the string
		String str2 = "TestLeaf";
		String str3 = "TestLeaf";
		// Same memeory location
		if (str2.equals(str3)) {
			System.out.println("equal content");
		} else
			System.out.println(" not equal ");
		String strnew = new String("Amma");
		String strnew1 = new String("Amma");
		if(strnew==strnew1) {
			System.out.println(" same location ");
		}
		else
			System.out.println(" not a same location");
	}

}
