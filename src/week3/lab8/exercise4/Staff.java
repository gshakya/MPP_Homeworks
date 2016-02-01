package week3.lab8.exercise4;

public class Staff extends Person implements Earns {
	

	private double salary;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;		
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
}
