package week3.lab7.exercise1;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private Company companyName;
	private ArrayList<Position> assocPostions;

	public Department(String name, String location) {
		this.name = name;
		this.location = location;
		assocPostions = new ArrayList<Position>();
	}

	public void addPostion(Position p) {
		p.setDepartment(this);
		assocPostions.add(p);
	}

	public void print() {
		print("");
	}

	public void print(String string) {
		System.out.println(string + "Department Name: " + name);
		System.out.println(string + "Location: " + location);
		for (Position p : assocPostions) {
			p.print(string + "--");
		}
	}

	public void setCompany(Company c) {
		companyName = c;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSalary = 0;
		for (Position p : assocPostions) {
			totalSalary = totalSalary + p.getSalary();
		}

		return totalSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assocPostions == null) ? 0 : assocPostions.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Department other = (Department) obj;
		if (assocPostions == null) {
			if (other.assocPostions != null)
				return false;
		} else if (!assocPostions.equals(other.assocPostions))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
