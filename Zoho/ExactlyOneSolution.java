package Zoho;


import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;

public class ExactlyOneSolution {

	
	private static Set<Integer> set;
	

	public static void main(String[] args) {
	
Set<Integer> num=new HashSet<Integer>();
num.add(2);
num.add(7);
num.add(11);
num.add(15);

int target=9;
System.out.println("num="+num);
System.out.println("target="+target);
Integer[] num1=set.toArray(new Integer[set.size()]);
int length=num1.length;

for(int i=0;i<num1.length;i++) {
	for(int j=1;j<num1.length;j++) {
		if(num1[i]+num1[j]==target) {
			int index = i;{
		
			System.out.println(index);
		}
	
		}
	}
}
	}


	private static Integer[] convertIntegerSetToStringSet(Set<Integer> num) {
		// TODO Auto-generated method stub
		return null;
	}
	}



	

