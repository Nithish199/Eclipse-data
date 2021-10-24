package Week3.Day1;

public class ExecutionClass extends Vechile {
	public static void main(String[] args) {
		
	
BMW a=new BMW();
a.driveVehicle();
a.applyBrake();
a.closeDoor();
a.fillFuel();
a.shiftGear();

Audi b=new Audi();
b.driveVehicle();
b.applyBrake();
b.closeDoor();
b.fillFuel();
b.shiftGear();
System.out.println("car wheel count: "+b.carWheel+"\n");

Bajaj c=new Bajaj();
c.driveVehicle();
c.applyBrake();
c.closeDoor();
c.fillFuel();
System.out.println("Auto wheel count: "+c.wheelOfauto);
	}
}