package Day1.Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 13, m, i, flag = 0;
		m = n / 2;
			for (i = 2; i <= m;) {
				if (n % i == 0) {
					System.out.println(n + " is not a Prime Number");
				}
				flag = 1;
				break;
			}
			if (flag == 1) {
				System.out.println(n + " is a Prime Number");
			}
		}

	}


