package Week3.Day1;

public class OverLoadingExercise {
	public void add(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}

	public void add(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}

	public void multiply(int x, int y) {
		int multiply = x * y;
		System.out.println(multiply);
	}

	public void multiply(int x, int y, int z) {
		int multiply = x * y * z;
		System.out.println(multiply);
	}

	public static void main(String[] args) {
		OverLoadingExercise o = new OverLoadingExercise();
		o.add(5, 2);
		o.add(2, 3, 5);

	}

}
