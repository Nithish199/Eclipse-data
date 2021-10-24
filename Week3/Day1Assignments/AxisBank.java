package Week3.Day1Assignments;

public class AxisBank extends BankInfo {
@Override
public void deposit() {
	System.out.println("deposit by father");
}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.savings();
	a.fixed();
	a.deposit();
}
}
