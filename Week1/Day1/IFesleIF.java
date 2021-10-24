package Week1.Day1;

public class IFesleIF {

	public static void main(String[] args) {
		int number = 59;
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("Trizz-Fizz");
		} else if (number % 3 == 0) {
			System.out.println(" Trizz");
		} else if (number % 5 == 0) {
			System.out.println(" Fizz");
		} else {
			System.out.println("the number is not divisible by both 3 & 5");
		}
	}

}
