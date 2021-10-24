package Week1.Day2;

import Week1.Day1.ClassandMethods;

public class MyMobile {
	String objectCategory = " Mobile Phones ";
	float Size;
	String Shape;
	String IMEI;
	char brandName;
	int Resolution;
	byte Weight;
	boolean istouchscreen;
	short costMobile;

	
	public static void makeCalls() {
		System.out.println(" Making Calls ");
	}

	public static void sendMsg() {
		System.out.println(" sendMsg ");
	}
	private static void payBills() {
		System.out.println(" payBills ");
	}
	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		obj.brandName = 'S';
		obj.costMobile = 30000;
		System.out.println((" Samsung Brand: " + obj.brandName));
		System.out.println((" Samsung Cost: " + obj.costMobile));
		}
}	
