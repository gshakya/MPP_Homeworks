package week3.lab8.exercise4;

import java.util.ArrayList;

public class Student extends Person implements Studies {
	private double gpa;
	private ArrayList<Course> coursesTaken;

	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.gpa = gpa;
		coursesTaken = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public void addCourse(Course c) {
		coursesTaken.add(c);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean hasFaculty(Faculty f) {
		return 
				coursesTaken.stream()
						    .filter(c->c.getOfFaculty().equals(f))
						    .count()>0?true:false;
	}
}
