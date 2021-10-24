package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums= {10,24,32,64,85,37,12,10};
		Set <Integer> unique=new LinkedHashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!unique.add(nums[i])) {
				System.out.println("Duplicte Value is :"+nums[i]);
			}
		}
		System.out.println(unique);
	}
}
