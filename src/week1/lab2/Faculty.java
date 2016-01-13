package week1.lab2;

import java.util.ArrayList;

public class Faculty extends Person {
	private double salary;
	private ArrayList<Course> coursesOffered;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		coursesOffered = new ArrayList<>();

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ArrayList<Course> getCoursesOffered() {
		return coursesOffered;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coursesOffered == null) ? 0 : coursesOffered.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (coursesOffered == null) {
			if (other.coursesOffered != null)
				return false;
		} else if (!coursesOffered.equals(other.coursesOffered))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public void addCourse(Course c) {
		coursesOffered.add(c);
	}

	public int gotTotalUnits() {
		int totalUnits = 0;
		for (Course c : coursesOffered) {
			totalUnits = totalUnits + c.getUnits();
		}
		return totalUnits;
	}
	
	
	
}
