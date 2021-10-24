package Week3.Day1Assignments;

public class Student extends Department{
	public  void studentName() {
System.out.println("Nithish Kumar");
}
	public  void studentDept() {
System.out.println("Mechanical");
}
	public  void studentId() {
System.out.println("212217114137");
}
public static void main(String[] args) {
	Department d =new Department();
	d.collegeName();
	d.collegeCode();
	d.collegeRank();
	d.deptName();
	Student s=new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
}
}
