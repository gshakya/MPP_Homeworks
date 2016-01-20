package week2.lab5_1;

public class Hourly extends Employee{
	
	private double hourlyWage;
	private int hoursPerWeek;
	

	@Override
	public double calcGrossPay(DateRange timePeriod) {
		// TODO Auto-generated method stub
		return  4*hourlyWage*hoursPerWeek;
	}


	public Hourly(int empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	
}
