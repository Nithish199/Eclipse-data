package Week1.Day2;

public class TwoSumProblem {

	public static void main(String[] args) {
		//int num[]={2,11,15,7,3,5,4};
		//target=9
		//0,1,2,3,4,5,6,7
		//2,11,15,7,3,5,4
		//2+11, 2 add with all the numberin an array
		//similarly for all the numbers
		
	int num[]={2,11,15,7,3,5,4};
	int target=9;
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if((num[i]+num[j])==target) {
				System.out.println(num[i]);
				System.out.println(num[j]);
				//  To print with the index
				System.out.println(num[i]+" index of "+j);
			}
		}
	}
	}
}
