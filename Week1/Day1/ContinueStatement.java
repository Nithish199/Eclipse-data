package Week1.Day1;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				continue;    //due to continue statement this print i==0 values without breaking the loop
			}
			System.out.println(i);

		}

	}
}
