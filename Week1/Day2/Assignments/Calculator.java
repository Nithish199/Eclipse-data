package Week1.Day2.Assignments;

public class Calculator {
	int num1 = 80;
	int num2 = 20;
	int num3 = 30;
	int sum = (int) (num1 + num2 + num3);
	int sub = (int) (num1 - num2 - num3);
	int multi = (int) (num1 * num2 * num3);
	float div = (num1 / num2);

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int result = obj.sum;
		int result1 = obj.sub;
		int result2 = obj.multi;
		float result3 = obj.div;
		{
			System.out.println(result);
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
		}
	}
}
