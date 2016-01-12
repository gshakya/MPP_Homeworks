package week1.lab2;

public class StaffStudent extends Staff {
	private double gpa;

	public StaffStudent(String name, String phone, int age, double salary, double gpa) {
		super(name, phone, age, salary);
		this.gpa = gpa;
		// TODO Auto-generated constructor stub
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
