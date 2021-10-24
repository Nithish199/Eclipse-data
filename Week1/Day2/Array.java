package Week1.Day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int arr[] = {100,49,398,34,1,267};
		int length=arr.length;{
		System.out.println(" Length of an array:"+length);
	}

	Arrays.sort(arr);
	System.out.println("sorted output");
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
{
	System.out.println( "\n"+ arr[length-2]);
}
{
	System.out.println("\n"+ arr[1]);
}

}
}


