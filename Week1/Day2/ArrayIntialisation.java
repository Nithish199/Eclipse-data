package Week1.Day2;

import java.util.Arrays;

public class ArrayIntialisation {

	public static void main(String[] args) {
		// Array Initialisation
		int[] numarray = { 12, 221, 10, 133, 14, 105, 16 };
		// size of an array
		int length = numarray.length;
		System.out.println(+length);
		// Length=index + 1
		// Index=length - 1
		// How to access the element of an array - index
		System.out.println(numarray[2]);
		// Last element
		System.out.println(numarray[length - 1]);
		// From last 2nd digit
		System.out.println(numarray[length - 2]);
		// First element
		System.out.println(numarray[0]);
		// To print all the elements of an array
		for (int i = 0; i < numarray.length; i++) {
			System.out.println(numarray[i]);
		}
		//for (int j = i+1; i < numarray.length; i--) {
			//System.out.println(numarray[i]);
		// Sorting an array
			Arrays.sort(numarray);
			System.out.println("sorted output");
			for(int k=0;k<numarray.length;k++) {
				System.out.println(numarray[k]);
				}
			}
	}

