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
