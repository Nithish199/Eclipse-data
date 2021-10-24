package Week1.Day2.Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		int length=data.length;
		for(int i=0;i<length;i++) {
			System.out.println(data[length-2]);
			break;
		}

	}

}
