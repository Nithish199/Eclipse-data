package Week3.Day1Assignments;

public class Desktop extends Computer {

public void Desktop() {
	System.out.println("My desktop size is 15.6 inch");
	}
public static void main(String[] args) {
	Computer a=new Computer();
	a.computerModel();
	Desktop b=new Desktop();
	b.Desktop();
}
}
