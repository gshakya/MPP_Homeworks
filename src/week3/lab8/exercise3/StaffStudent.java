package week3.lab8.exercise3;

public class StaffStudent extends Staff  implements Earns,Studies{

	private Student stdInfo;

	public StaffStudent(String name, String phone, int age, double salary, double gpa) {
		super(name, phone, age, salary);
		
		stdInfo = new Student(name, phone, age, gpa);
	}

	public double getGpa() {
		return stdInfo.getGpa();
	}

	
}
