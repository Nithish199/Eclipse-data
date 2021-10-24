package Week3.Day1Assignments;

public class Students {
	public void getStudentInfo(int id) {
System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
System.out.println(id);
System.out.println(name);
}

	public void getStudentInfo(String email, long PhoneNumber) {
		System.out.println(email);
		System.out.println(PhoneNumber);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(11);
		obj.getStudentInfo(11, "nik");
		obj.getStudentInfo("nithish@gmail.com", 86820416);
	}
}
