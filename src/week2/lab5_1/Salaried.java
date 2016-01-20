package week2.lab5_1;

public class Salaried extends Employee {
	private double salary;

	public Salaried(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange timePeriod) {
		return salary;
	}

}
