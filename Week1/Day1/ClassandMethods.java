package Week1.Day1;

public class ClassandMethods {

	// variables/state
	String objectCategory = " Mobile Phones ";
	float Size;
	String Shape;
	String IMEI;
	char brandName;
	int Resolution;
	byte Weight;
	boolean istouchscreen;
	short costMobile;

	// Methods/Behaviour
	public static void makeCalls() {
		System.out.println(" Making Calls ");
	}

	public static void viewGallery() {
		System.out.println(" Viewing The Gallery ");
	}

	// TO make use of the members of class
	// Step 1: main()method
	// Step 2: Create a object
	// Memory is allocated only when an object is created
	// Memory allocation is not done when class is created

	public static void main(String[] args) {
		// <Class Name> <Object Name> = New Class Name()
		ClassandMethods samsung = new ClassandMethods();
		samsung.brandName = 'S';
		samsung.costMobile = 30000;
		// samsung.viewGallery();
		// samsung.makeCalls();
		// members of a class can be accesses only through objects
		System.out.println((" Samsung Brand: " + samsung.brandName));
		System.out.println((" Samsung Cost: " + samsung.costMobile));

		ClassandMethods apple = new ClassandMethods();
		apple.brandName = 'A';
		apple.costMobile = 31000;
		System.out.println(("\n Apple Brand: " + apple.brandName));
		System.out.println((" Apple Cost: " + apple.costMobile));
	}
}
